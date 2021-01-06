
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Employee_Details extends javax.swing.JFrame {
    
    public Employee_Details() {
        initComponents();
        show_employee();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=BookShopDb;user=admin;password=1234";
    
    public ArrayList<Employee> employeeList()
    {
        ArrayList<Employee> employeeList=new ArrayList<>();
        
        String query="select * from Employee_Table";
        
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            Employee employee;
            
            while(rs.next())
            {
                employee=new Employee(rs.getInt("Employee_ID"),rs.getString("Employee_Name"),rs.getString("Employee_ContactNo"),rs.getString("Employee_Address"),rs.getString("DOB"),rs.getString("Gender"),rs.getString("Designation"),rs.getString("Salary"));
                employeeList.add(employee);
            }
            
            
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        return employeeList;
    }
    
     public void show_employee()
    {
        ArrayList<Employee> list=employeeList();
        DefaultTableModel model=(DefaultTableModel)jTable_Display_Employee.getModel();
        Object[] row=new Object[8];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getContactno();
            row[3]=list.get(i).getAddress();
            row[4]=list.get(i).getDob();
            row[5]=list.get(i).getGender();
            row[6]=list.get(i).getDesignation();
            row[7]=list.get(i).getSalary();
            model.addRow(row);
        }
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Employee = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contactno = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AddDetailsBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        SelectIdBtn = new javax.swing.JButton();
        selectid = new javax.swing.JTextField();
        UpdateDetailsBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        labelid = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        DeleteDetailsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Details");
        setPreferredSize(new java.awt.Dimension(1924, 1028));
        setResizable(false);
        setSize(new java.awt.Dimension(1924, 1028));

        jTable_Display_Employee.setBackground(new java.awt.Color(255, 255, 204));
        jTable_Display_Employee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_Display_Employee.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable_Display_Employee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Contact No", "Address", "Date of Birth", "Gender", "Designation", "Salary"
            }
        ));
        jTable_Display_Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_EmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Employee);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add / Update Employee Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Employee Name");

        name.setBackground(new java.awt.Color(240, 240, 240));
        name.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Contact No");

        contactno.setBackground(new java.awt.Color(240, 240, 240));
        contactno.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        address.setBackground(new java.awt.Color(240, 240, 240));
        address.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Date of Birth");

        dob.setBackground(new java.awt.Color(240, 240, 240));
        dob.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        gender.setBackground(new java.awt.Color(240, 240, 240));
        gender.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Gender");

        designation.setBackground(new java.awt.Color(240, 240, 240));
        designation.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Designation");

        salary.setBackground(new java.awt.Color(240, 240, 240));
        salary.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Salary");

        AddDetailsBtn.setBackground(new java.awt.Color(51, 51, 255));
        AddDetailsBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddDetailsBtn.setText("Add Details");
        AddDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDetailsBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Reset");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        SelectIdBtn.setBackground(new java.awt.Color(102, 102, 0));
        SelectIdBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SelectIdBtn.setForeground(new java.awt.Color(255, 255, 255));
        SelectIdBtn.setText("Select ID");
        SelectIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectIdBtnActionPerformed(evt);
            }
        });

        selectid.setBackground(new java.awt.Color(240, 240, 240));
        selectid.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        selectid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectidActionPerformed(evt);
            }
        });

        UpdateDetailsBtn.setBackground(new java.awt.Color(51, 204, 0));
        UpdateDetailsBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        UpdateDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateDetailsBtn.setText("Update Details");
        UpdateDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDetailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(AddDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(designation)
                                .addComponent(salary, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                .addComponent(gender)
                                .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                .addComponent(address)
                                .addComponent(contactno, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(UpdateDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SelectIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(selectid, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(UpdateDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 0, 51));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Delete Employee Details");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        labelid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelid.setText("Employee ID");

        id.setBackground(new java.awt.Color(240, 240, 240));
        id.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        DeleteDetailsBtn.setBackground(new java.awt.Color(102, 0, 102));
        DeleteDetailsBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteDetailsBtn.setText("Delete Details");
        DeleteDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDetailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelid, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelid)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(DeleteDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDetailsBtnActionPerformed
       
        String sql="EXEC employeeDetails ?,?,?,?,?,?,?";
        
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url);
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1, name.getText());
            st.setString(2, contactno.getText());
            st.setString(3, address.getText());
            st.setString(4, dob.getText()); 
            st.setString(5, gender.getText()); 
            st.setString(6, designation.getText());
            st.setString(7, salary.getText());
            
            int result=st.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)jTable_Display_Employee.getModel();
            model.setRowCount(0);
            show_employee();
            
            if(result==1)
            {
                JOptionPane.showMessageDialog(null,"Record Inserted Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error!");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_AddDetailsBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        selectid.setText("");
        id.setText("");
        name.setText("");
        contactno.setText("");
        address.setText("");
        dob.setText("");
        gender.setText("");
        designation.setText("");
        salary.setText("");
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void UpdateDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDetailsBtnActionPerformed
        String sql="EXEC updateEmployeeDetails ?,?,?,?,?,?,?,?";
        
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url);          
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1, selectid.getText());           
            st.setString(2, name.getText());
            st.setString(3, contactno.getText());
            st.setString(4, address.getText());
            st.setString(5, dob.getText()); 
            st.setString(6, gender.getText()); 
            st.setString(7, designation.getText());
            st.setString(8, salary.getText());
            
            int result=st.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)jTable_Display_Employee.getModel();
            model.setRowCount(0);
            show_employee();
            
            if(result==1)
            {
                JOptionPane.showMessageDialog(null,"Record Updated Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateDetailsBtnActionPerformed

    private void DeleteDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDetailsBtnActionPerformed
         String sql="delete from Employee_Table where Employee_ID=? ";
        
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url);
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1, id.getText());
            
            int result=st.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)jTable_Display_Employee.getModel();
            model.setRowCount(0);
            show_employee();
            
            if(result==1)
            {
                JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error!");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteDetailsBtnActionPerformed

    private void jTable_Display_EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_EmployeeMouseClicked
        int i=jTable_Display_Employee.getSelectedRow();
        TableModel model=jTable_Display_Employee.getModel();
        selectid.setText(model.getValueAt(i,0).toString());
        name.setText(model.getValueAt(i,1).toString());
        contactno.setText(model.getValueAt(i,2).toString());
        address.setText(model.getValueAt(i,3).toString());
        dob.setText(model.getValueAt(i,4).toString());
        gender.setText(model.getValueAt(i,5).toString());
        designation.setText(model.getValueAt(i,6).toString());
        salary.setText(model.getValueAt(i,7).toString());
    }//GEN-LAST:event_jTable_Display_EmployeeMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void selectidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectidActionPerformed
        //
    }//GEN-LAST:event_selectidActionPerformed

    private void SelectIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectIdBtnActionPerformed
         ArrayList<Employee> detailsList=new ArrayList<>();
            
            String query="select * from Employee_Table where Employee_ID=?";
            
            try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url);          
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, selectid.getText()); 
            
            ResultSet rs=st.executeQuery();                
            Employee employee;
            
            while(rs.next())
            {
                employee=new Employee(rs.getInt("Employee_ID"),rs.getString("Employee_Name"),rs.getString("Employee_ContactNo"),rs.getString("Employee_Address"),rs.getString("DOB"),rs.getString("Gender"),rs.getString("Designation"),rs.getString("Salary"));
                detailsList.add(employee);
                
            }
                        
            
             for(int i=0;i<detailsList.size();i++)
            {     
              name.setText(detailsList.get(i).getName()); 
              contactno.setText(detailsList.get(i).getContactno());
              address.setText(detailsList.get(i).getAddress());
              dob.setText(detailsList.get(i).getDob());
              gender.setText(detailsList.get(i).getGender());
              designation.setText(detailsList.get(i).getDesignation());
              salary.setText(detailsList.get(i).getSalary());
            }
             
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Employee_Details.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_SelectIdBtnActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDetailsBtn;
    private javax.swing.JButton DeleteDetailsBtn;
    private javax.swing.JButton SelectIdBtn;
    private javax.swing.JButton UpdateDetailsBtn;
    private javax.swing.JTextField address;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Employee;
    private javax.swing.JLabel labelid;
    private javax.swing.JTextField name;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField selectid;
    // End of variables declaration//GEN-END:variables
}