class Thread3c1 {
    private int value = 0;

    public synchronized int getNext() {

        value++;
        return value; // when thread enter synchronize block.Then it either exit or not run at all.

    }
}