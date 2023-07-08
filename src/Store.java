class Store {
    Member[] member = new Member[3];
    int count = 0;

    void register(Member members){
        member[count++] = members;
    }
    void inviteSale(){
        for (int i = 0; i<count; i++){
            member[i].callBack();
        }
    }
}
