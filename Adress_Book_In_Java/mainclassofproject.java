package addressbook;
//Main class
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.LinkedList;
import java.util.List;


public class AddressBook extends JFrame{
    
    static List<Address> liste=new LinkedList();
    static   JTextField IDtext;
    static   JTextField IDName;  
    static   JTextField StreetText;
    static   JTextField CityText;
    static   JTextField GenderText;
    static   JTextField ZIPText;
    static TextHelper helper =new TextHelper();
    
    public static void main(String[] args) throws IOException {
        new AddressBook();
        
      
		liste=helper.Read();
	//	
      }

    public AddressBook(){
            
       this.setSize(550,200);
       this.setTitle("Address Book");
       JPanel panel=new JPanel();
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JLabel ID=new JLabel(" ID          ");
       IDtext=new JTextField(40);
        
       JLabel Name=new JLabel("Name    ");
       IDName=new JTextField(40);
        
       JLabel Street=new JLabel("Street   ");
       StreetText=new JTextField(40);
        
       JLabel City=new JLabel("    City     ");
       CityText=new JTextField(20);
        
       JLabel Gender=new JLabel("Gender  ");
       GenderText=new JTextField(4);
        
       JLabel ZIP=new JLabel("ZIP ");
       ZIPText=new JTextField(7);
        
       JButton add=new JButton("Add");
       add.addActionListener(new ActionListener() {
            
           @Override
            public void actionPerformed(ActionEvent e) {
                  Address temp=new Address();
                  
                  int state=0;
                  
                  state+=temp.setID(IDtext.getText());
                  state+=temp.setCity(CityText.getText());
                  state+=temp.setName(IDName.getText());
                  state+=temp.setStreet(StreetText.getText());
                  state+=temp.setGender(GenderText.getText());
                  state+=temp.setZIP(ZIPText.getText());
                   if(state>0) {
                	   JOptionPane.showMessageDialog(null,"Address couldn't add");

                   }
                   else {
                	   liste.add(temp);
                   }
                   Clear();
                   }
        });
        JButton first=new JButton("First");
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   
                
                if(liste.size()==0)
                    return;
                
                Address temp=liste.get(0);
                AssignValue(temp);
                    
                    
                   }
        });
        JButton next=new JButton("Next");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                  if(IDtext.getText()==null)
                      return;                
             
                Address[] adds=liste.toArray(new Address[liste.size()]);
                String currID=IDtext.getText();
                
                int state=0;
                
                for (Address add1 : adds) {
                    
                    if(state==1){
                        AssignValue(add1);
                        return;
                    }
                    
                    if(add1.getID().equals(currID)){
                        state++;
                    }
                }
                
            }
            
            
        });
        
        JButton previous=new JButton("Previous");
         previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                  if(IDtext.getText()==null)
                      return;
                                          
                Address[] adds=liste.toArray(new Address[liste.size()]);
                String currID=IDtext.getText();
                
                int state=0;
                for (int i = adds.length-1; i >=0; i--) {
                      if(state==1){
                        AssignValue(adds[i]);
                        return;
                    }
                    
                    if(adds[i].getID().equals(currID)){
                        state++;
                    }
                    
                }
                
                
            }
            
            
        });
        JButton last=new JButton("Last");
        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
             if(liste.size()==0)
                 return;
             
             AssignValue(liste.get(liste.size()-1));
                
            }
                     
        });
        JButton update=new JButton("Update");
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
             if(IDtext.getText()==null)
                      return;
             
             String ID=IDtext.getText();
             
                for (Address address : liste) {
                    
                    if(address.getID().equals(ID)){
                        
                        ReAssign(address);
                        
                        
                    }
                    
                }          
                
            }
            
            
        });
        
        
        
        JButton search=new JButton("Search");
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
             if(IDtext.getText()==null)
                      return;
             
             String ID=IDtext.getText();
             
                for (Address address : liste) {
                    
                    if(address.getID().equals(ID)){
                        
                        AssignValue(address);
                        
                        
                    }
                    
                }
             
             
                
            }
            
            
        });
    
         
        panel.add(ID);
        panel.add(IDtext);
       
        panel.add(Name);
        panel.add(IDName);
        
        panel.add(Street);
        panel.add(StreetText);
        
        panel.add(City);
        panel.add(CityText);
        
        panel.add(Gender);
        panel.add(GenderText);
        
        panel.add(ZIP);
        panel.add(ZIPText);
       
        panel.add(add);
        panel.add(first);
        panel.add(next);
        panel.add(previous);
        panel.add(last);
        panel.add(update);
        panel.add(search);
        
        this.add(panel);
        this.setVisible(true);
        
    this.addWindowListener(new java.awt.event.WindowAdapter() {
    	@Override
    	public void windowClosing(java.awt.event.WindowEvent windowEvent) {
    		helper.Write(liste);
    	}
    	
    	
    });
        
    }
    
    private static void AssignValue(Address temp){
      
                
        IDtext.setText(temp.getID());
        StreetText.setText(temp.getStreet());
        CityText.setText(temp.getCity());
        GenderText.setText(temp.getGender());
        IDName.setText(temp.getName());
        ZIPText.setText(temp.getZIP());
        
        
    }
    
    private static void Clear(){
                      
        IDtext.setText("");
        StreetText.setText("");
        CityText.setText("");
        GenderText.setText("");
        IDName.setText("");
        ZIPText.setText("");
        
        
    }
    public static void ReAssign(Address temp){
          
         temp.setID(IDtext.getText());
         temp.setStreet(StreetText.getText());
         temp.setCity(CityText.getText());
         temp.setName(IDName.getText());
         temp.setZIP(ZIPText.getText());
         temp.setGender(GenderText.getText());
        
    }
    
    }
