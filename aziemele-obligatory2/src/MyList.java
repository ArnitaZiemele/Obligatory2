public class MyList {
    static Node first; //pirmais mezgls
    static class Node { //mezgla klase
        int data;
        Node next;

        Node(int n) { //konstruktors
            data = n;
            next = null;
        }
    }

    public void add(int data){ //mezgla pievienošana sarakstam
        Node newNode = new Node(data);
        newNode.next = null;

        if(first == null){ //ja neeksistē pirmais mezgls (saraksts ir tukšs)
            first = newNode; //pievieno pirmo mezglu
        }
        else{//ja saraksts nav tukšs
            Node last = first; //pievieno jauno mezglu
            while(last.next != null){ //pārvieto jauno mezglu uz saraksta beigām
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public static int get (int num){ //mezglu numerācija un atrašana pēc to pozīcijas
        Node done = first; //sāk skaitīt no saraksta sākuma

        for(int i = 0; i < num; i++) { // iet cauri visam sarakstam līdz norādītajam mezglam
            done = done.next;
        }
        return done.data; //atgriež mezgla saturu
    }
}
