class ResistorColor {
    int colorCode(String color) {
        String arr [] = colors();
        int index=0;
        int code =0;
        for( ; index < arr.length ; index++){
            if(color.equals(arr[index])){
                code = index;
                break;
                }
        }
        return code;
        
    }

    String[] colors() {
      String arr[] = {"black" , "brown" , "red" , "orange" , "yellow" , "green" , "blue" , 
                     "violet" , "grey" , "white"};
        return arr;
        
    }
}
