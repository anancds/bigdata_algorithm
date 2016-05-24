package com.cds.bigdata.consistentHash;

public class Node {
    private String name;

    public Node(String id) {
        name = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
