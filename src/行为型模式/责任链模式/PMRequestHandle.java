package ��Ϊ��ģʽ.������ģʽ;
public class PMRequestHandle implements RequestHandle {

    RequestHandle rh;
    
    public PMRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }
    
    public void handleRequest(Request request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println("Ҫ��н, ��Ŀ��������!");
        } else {
            rh.handleRequest(request);
        }
    }
}
