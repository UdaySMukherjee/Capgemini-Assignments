package HashMAp;

import java.util.LinkedList;
import java.util.Objects;

public class hashMap {

	private LinkedList<Node>[] buckets;
	private int n; // total number of nodes
	private int N; // number of buckets

	public hashMap() {
		N = 4;
		buckets = new LinkedList[N];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	
	public boolean ContainsKey(int key){
		int bi = hashFunction(key);
		int di = getDataIndex(bi, key);
		if(di!=-1) {
			return true;
		}
		return false;
	}
	
	public String getValue(int key) {
		int bi = hashFunction(key);
		int di = getDataIndex(bi, key);
		if(di!=-1) {
			return buckets[bi].get(di).value;
		}
		return null;
	}

	public void put(int key, String value) {
		int bi = hashFunction(key);
		int di = getDataIndex(bi, key);
		if (di != -1) {
			buckets[bi].get(di).value = value;
		} else {
			buckets[bi].add(new Node(key, value));
			n++;
		}

		double lamda = (double) n / N;
		if (lamda > 2.0) {
			rehash();
		}
	}

	private void rehash() {
		LinkedList<Node>[] old = buckets;
		buckets = new LinkedList[N * 2];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<Node>();
		}
		n = 0;
		for (int i = 0; i < old.length; i++) {
			LinkedList<Node> list = old[i];
			for (int j = 0; j < list.size(); j++) {
				put(list.get(j).key, list.get(j).value);
			}
		}
		N = buckets.length;

	}

	private int getDataIndex(int bi, int key) {
		LinkedList<Node> list = buckets[bi];
		for (int i = 0; i < list.size(); i++) {
			Node node = list.get(i);
			if (node.key == key) {
				return i;
			}
		}
		return -1;
	}

	private int hashFunction(int key) {
		return Math.abs(Objects.hash(key) % buckets.length);
	}

	public void display() {
		for (int i = 0; i < buckets.length; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				System.out.println("Key: " + buckets[i].get(j).key + "--> value: " + buckets[i].get(j).value);
			}
		}
	}

	private class Node {
		int key;
		String value;

		Node(int Key, String value) {
			this.key = Key;
			this.value = value;
		}

	}

}
