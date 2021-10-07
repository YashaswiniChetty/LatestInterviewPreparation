package Stack;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int depth=0;
        for(String log: logs){
            if(log.equals("./")){
                continue;
            }else if(log.equals("../")){
                depth--;
                if(depth<0){//if we alreday reached main folder be in main folder
                    depth=0;
                }
            }else{
                depth++;
            }
        }
        return depth;
    }
}
