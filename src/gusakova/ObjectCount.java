package gusakova;

class ObjectCount {
    static int objCount = 0;

    ObjectCount() {
        objCount++;
    }

    public static int getObjectCount() {
        return objCount;
    }
}

class Main {
    public static void main(String[] args) {
        ObjectCount obj = new ObjectCount();
        System.out.println(ObjectCount.getObjectCount());

         obj = new ObjectCount();
         obj = new ObjectCount();
         obj = new ObjectCount();
         obj = new ObjectCount();
        System.out.println(ObjectCount.getObjectCount());
    }
}

