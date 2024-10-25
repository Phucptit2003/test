package form;


import component.Chat_Title;
import component.Item_People;
import event.PublicEvent;
import model.Model_User_Account;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.miginfocom.swing.MigLayout;

public class Chat extends javax.swing.JPanel {

    private Chat_Title chatTitle;
    private Map<Integer, List<Object>> messageHistory;  // Lưu cả tin nhắn gửi và nhận cho mỗi userId
     private Item_People itemPeople;
     private Model_User_Account user; // Thêm biến user vào lớp Chat

    public Chat() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[100%, fill]0[shrink 0]0"));
        chatTitle = new Chat_Title();
        messageHistory = new HashMap<>();
        if (user != null) {
            itemPeople = new Item_People(user);
        }// user là đối tượng Model_User_Account đã được khởi tạo

        
        add(chatTitle, "wrap");
    }

    private void saveMessage(int userId, Object message) {
        if (!messageHistory.containsKey(userId)) {
            messageHistory.put(userId, new ArrayList<>());
        }
        messageHistory.get(userId).add(message);
    }

    
   

    public void updateUser(Model_User_Account user) {
        chatTitle.updateUser(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
