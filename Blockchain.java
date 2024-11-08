import java.util.ArrayList;

public class Blockchain {
    private ArrayList<Block> chain;

    public Blockchain() {
        chain = new ArrayList<>();
        chain.add(createGenesisBlock());
    }

    private Block createGenesisBlock() {
        return new Block("Genesis Block", "0");
    }

    public void addBlock(String data) {
        Block lastBlock = chain.get(chain.size() - 1);
        Block newBlock = new Block(data, lastBlock.getHash());
        chain.add(newBlock);
    }

    public void printChain() {
        for (Block block : chain) {
            System.out.println("Block Hash: " + block.getHash());
            System.out.println("Previous Hash: " + block.getPreviousHash());
            System.out.println("Data: " + block.getData());
            System.out.println();
        }
    }
}
