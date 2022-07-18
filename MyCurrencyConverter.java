package My_Currency_Converter;

import javax.swing.JOptionPane;

public class MyCurrencyConverter extends javax.swing.JFrame {
String [] currencyunits= {"units",
"US Dollars ",
"Pakistani RUPEES",
"YEN",
"Kuwait Dinar",
"Swiss Franc",
"Oman Rial",
"Canadian Dollar",
"Ind Rupees",
"Australian Dollars",
"NZ dollars",
"Singapore Dollar",
"Turkish Lira",
"Hong kong Dollars",
"Russian Ruble",
"Algerian Dinar",
"Argentine peso",
"Thai Bhat",
"Brazilian Real",
"Belgerian lev",
"Chilian Peso",
"Crotian Kuna",
"Czech koruna",
"Egyptian pound",
"Hungarian Forint",
"Iceland Krona",
"Indonasian Rupiah",
"Iranian Rial",
"Korean won",
"Malaysian Ringgit",
"Mexican Peso",
"Nigerian Naira",
"Norwagian Krone",
"Phillipine Peso",
"Qatari Rial",
"Romanian Leu",
"Saudi Rial",
"Serbian Dinar",
"Sri lankan Rupees",
"Swedish Krona",
"Taiwan Dollars",
"Ukarine Hryvnia",
"UAE Dirham",
"Zimbabwe Dollars"};

double USDollars= 1.1900;
double PakistaniRUPEES = 1.1900;
double YEN = 154.49;
double KuwaitDinar = 0.406221;
double SwissFranc = 1.2480;
double OmanRial = 0.516096;
double CanadianDollar = 1.7107;
double IndRupees = 100.60;
double AustralianDollars = 1.9170;
double NZdollars = 2.0495;
double SingaporeDollar = 1.8177;
double TurkishLira = 18.1681;
double HongkongDollars = 10.4456;
double RussianRuble= 104.27;
double AlgerianDinar = 188.37;
double Argentinepeso= 140.53;
double ThaiBhat=44.83;
double BrazilianReal=7.1953;
double Belgerianlev=2.3520;
double ChilianPeso=1090.28;
double CrotianKuna=9.0559;
double Czechkoruna=29.44;
double Egyptianpound=21.10;
double HungarianForint=431.21;
double IcelandKrona=173.16;
double IndonasianRupiah=19285.94;
double IranianRial=56441.10;
double Koreanwon=1621.64;
double MalaysianRinggit=5.6164;
double MexicanPeso=27.89;
double NigerianNaira=557.19;
double NorwagianKrone = 12.04;
double PhillipinePeso= 68.54;
double QatariRial=4.8808;
double RomanianLeu=5.9467;
double SaudiRial=5.0295;
double SerbianDinar= 141.39;
double SrilankanRupees=270.80;
double SwedishKrona = 12.64;
double TaiwanDollars=37.32;
double UkarineHryvnia=38.50;
double UAEDirham=4.9236;
double ZimbabweDollars= 435.55;
    /**
     * Creates new form MyCurrencyConverter
     */
    public MyCurrencyConverter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstcountry = new javax.swing.JComboBox();
        secondcountry = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        secondcurrencyunit = new javax.swing.JLabel();
        firstcurrencyunit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 199, 17));
        jLabel1.setText("        CURRENCY CONVERTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 11, 432, 50));

        firstcountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Country:", "USA", "Pakistan", "Japan", "Kuwait", "Switzerland", "Oman", "Canada", "India", "Australia", "NewZealand", "Singapore", "Turkiye", "HongKong", "Russia", "Algeria", "Argentina", "Thailand", "Brazil", "Bulgaria", "Chile", "Crotia", "CzechRepublic", "Egypt", "Hungary", "Iceland", "Indonasia", "Iran", "Korea", "Malaysia", "Mexico", "Nigeria", "Norway", "Phillipine", "Qatar", "Romania", "SaudiArabia", "Serbia", "Srilanka", "Sweden", "Taiwan", "Ukarine", "UAE", "Zimbabwe" }));
        firstcountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstcountryItemStateChanged(evt);
            }
        });
        firstcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstcountryActionPerformed(evt);
            }
        });
        jPanel1.add(firstcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 141, 220, 39));

        secondcountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Country:", "USA", "Pakistan", "Japan", "Kuwait", "Switzerland", "Oman", "Canada", "India", "Australia", "NewZealand", "Singapore", "Turkiye", "HongKong", "Russia", "Algeria", "Argentina", "Thailand", "Brazil", "Bulgaria", "Chile", "Crotia", "CzechRepublic", "Egypt", "Hungary", "Iceland", "Indonasia", "Iran", "Korea", "Malaysia", "Mexico", "Nigeria", "Norway", "Phillipine", "Qatar", "Romania", "SaudiArabia", "Serbia", "Srilanka", "Sweden", "Taiwan", "Ukarine", "UAE", "Zimbabwe" }));
        secondcountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondcountryItemStateChanged(evt);
            }
        });
        secondcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondcountryActionPerformed(evt);
            }
        });
        jPanel1.add(secondcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 141, 241, 39));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("INPUT:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 220, 27));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("OUTPUT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 241, 30));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 231, 220, 33));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 231, 241, 33));

        secondcurrencyunit.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        secondcurrencyunit.setForeground(new java.awt.Color(255, 255, 0));
        secondcurrencyunit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondcurrencyunit.setText("UNITS");
        jPanel1.add(secondcurrencyunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 140, 27));

        firstcurrencyunit.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        firstcurrencyunit.setForeground(new java.awt.Color(255, 255, 0));
        firstcurrencyunit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstcurrencyunit.setText("UNITS");
        jPanel1.add(firstcurrencyunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 160, 27));

        jButton1.setText("CONVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 303, 125, 37));

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 303, 125, 37));

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 303, 125, 37));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\pexels-karol-d-325154_X2B8GjbM(1).png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -120, 1070, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void firstcountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstcountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstcountryActionPerformed

    private void firstcountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstcountryItemStateChanged
            
        int position = firstcountry.getSelectedIndex();
        firstcurrencyunit.setText(currencyunits[position]);
        // TODO add your handling code here:
    }//GEN-LAST:event_firstcountryItemStateChanged

    private void secondcountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondcountryItemStateChanged
       int position = secondcountry.getSelectedIndex();
        secondcurrencyunit.setText(currencyunits[position]);
        // TODO add your handling code here:
    }//GEN-LAST:event_secondcountryItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        if(firstcountry.getSelectedIndex()==0 || secondcountry.getSelectedIndex()==0 || t1.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null,
                    "You must Select both Countries and must input the amount,","ERROR message",
                    JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        double amounttochange = Double.parseDouble(t1.getText());
        double amountinpounds= 0.0;
         
        switch(firstcountry.getSelectedItem().toString())
        {
            case "USA":
            amountinpounds = amounttochange/USDollars;
            break;
            case "Pakistan":
            amountinpounds = amounttochange/PakistaniRUPEES;
            break;
            case "Japan":
            amountinpounds = amounttochange/YEN;
            break;
            case "Kuwait":
            amountinpounds = amounttochange/KuwaitDinar;
            break;
            case "Switzerland":
            amountinpounds = amounttochange/SwissFranc;
            break;
            case "Oman":
            amountinpounds = amounttochange/OmanRial;
            break;
            case "Canada":
            amountinpounds = amounttochange/CanadianDollar;
            break;
            case "India":
            amountinpounds = amounttochange/IndRupees;
            break;
            case "Australia":
            amountinpounds = amounttochange/AustralianDollars;
            break;
            case "NewZealand":
            amountinpounds = amounttochange/NZdollars;
            break;
            case "Singapore":
            amountinpounds = amounttochange/SingaporeDollar;
            break;
            case "Turkiye":
            amountinpounds = amounttochange/TurkishLira;
            break;
            case "HongKong":
            amountinpounds = amounttochange/HongkongDollars;
            break;
            case "Russia":
            amountinpounds = amounttochange/RussianRuble;
            break;
            case "Algeria":
            amountinpounds = amounttochange/AlgerianDinar;
            break;
            case "Argentina":
            amountinpounds = amounttochange/Argentinepeso;
            break;
            case "Thailand":
            amountinpounds = amounttochange/ThaiBhat;
            break;
            case "Brazil":
            amountinpounds = amounttochange/BrazilianReal;
            break;
            case "Bulgaria":
            amountinpounds = amounttochange/Belgerianlev;
            break;
            case "Chile":
            amountinpounds = amounttochange/ChilianPeso;
            break;
            case "Croatia":
            amountinpounds = amounttochange/CrotianKuna;
            break;
            case "CzechRepublic":
            amountinpounds = amounttochange/Czechkoruna;
            break;
            case "Egypt":
            amountinpounds = amounttochange/Egyptianpound;
            break;
            case "Hungary":
            amountinpounds = amounttochange/HungarianForint;
            break;
            case "Iceland":
            amountinpounds = amounttochange/IcelandKrona;
            break;
            case "Indonesia":
            amountinpounds = amounttochange/IndonasianRupiah;
            break;
            case "Iran":
            amountinpounds = amounttochange/IranianRial;
            break;
            case "SouthKorea":
            amountinpounds = amounttochange/Koreanwon;
            break;
            case "Malaysia":
            amountinpounds = amounttochange/MalaysianRinggit;
            break;
            case "Mexico":
            amountinpounds = amounttochange/MexicanPeso;
            break;
            case "Nigeria":
            amountinpounds = amounttochange/NigerianNaira;
            break;
            case "Norway":
            amountinpounds = amounttochange/NorwagianKrone;
            break;
            case "Phillipine":
            amountinpounds = amounttochange/PhillipinePeso;
            break;
            case "Qatar":
            amountinpounds = amounttochange/QatariRial;
            break;
            case "Romania":
            amountinpounds = amounttochange/RomanianLeu;
            break;
            case "SaudiaArabia":
            amountinpounds = amounttochange/SaudiRial;
            break;
            case "Serbia":
            amountinpounds = amounttochange/SerbianDinar;
            break;
            case "SriLanka":
            amountinpounds = amounttochange/SrilankanRupees;
            break;
            case "Sweden":
            amountinpounds = amounttochange/SwedishKrona;
            break;
            case "Taiwan":
            amountinpounds = amounttochange/TaiwanDollars;
            break;
            case "Ukraine":
            amountinpounds = amounttochange/UkarineHryvnia;
            break;
            case "UAE":
            amountinpounds = amounttochange/UAEDirham;
            break;
            case "Zimbabwe":
            amountinpounds = amounttochange/ZimbabweDollars;
            break;
            default:
            amountinpounds=0.0;
            
        }
        
        double amountchanged = 0.0;
        switch(secondcountry.getSelectedItem().toString())
        {
            case "USA":
            amountchanged = amountinpounds*USDollars;
            break;
            case "Pakistan":
            amountchanged = amountinpounds*PakistaniRUPEES;
            break;
            case "Japan":
            amountchanged = amountinpounds*YEN;
            break;
            case "Kuwait":
            amountchanged = amountinpounds*KuwaitDinar;
            break;
            case "Switzerland":
            amountchanged = amountinpounds*SwissFranc;
            break;
            case "Oman":
            amountchanged = amountinpounds*OmanRial;
            break;
            case "Canada":
            amountchanged = amountinpounds*CanadianDollar;
            break;
            case "India":
            amountchanged = amountinpounds*IndRupees;
            break;
            case "Australia":
            amountchanged = amountinpounds*AustralianDollars;
            break;
            case "NewZealand":
            amountchanged = amountinpounds*NZdollars;
            break;
            case "Singapore":
            amountchanged = amountinpounds*SingaporeDollar;
            break;
            case "Turkiye":
            amountchanged = amountinpounds*TurkishLira;
            break;
            case "HongKong":
            amountchanged = amountinpounds*HongkongDollars;
            break;
            case "Russia":
            amountchanged = amountinpounds*RussianRuble;
            break;
            case "Algeria":
            amountchanged = amountinpounds*AlgerianDinar;
            break;
            case "Argentina":
            amountchanged = amountinpounds*Argentinepeso;
            break;
            case "Thailand":
            amountchanged = amountinpounds*ThaiBhat;
            break;
            case "Brazil":
            amountchanged = amountinpounds*BrazilianReal;
            break;
            case "Bulgaria":
            amountchanged = amountinpounds*Belgerianlev;
            break;
            case "Chile":
            amountchanged = amountinpounds*ChilianPeso;
            break;
            case "Croatia":
            amountchanged = amountinpounds*CrotianKuna;
            break;
            case "CzechRepublic":
            amountchanged = amountinpounds*Czechkoruna;
            break;
            case "Egypt":
            amountchanged = amountinpounds*Egyptianpound;
            break;
            case "Hungary":
            amountchanged = amountinpounds*HungarianForint;
            break;
            case "Iceland":
            amountchanged = amountinpounds*IcelandKrona;
            break;
            case "Indonesia":
            amountchanged = amountinpounds*IndonasianRupiah;
            break;
            case "Iran":
            amountchanged = amountinpounds*IranianRial;
            break;
            case "SouthKorea":
            amountchanged = amountinpounds*Koreanwon;
            break;
            case "Malaysia":
            amountchanged = amountinpounds*MalaysianRinggit;
            break;
            case "Mexico":
            amountchanged = amountinpounds*MexicanPeso;
            break;
            case "Nigeria":
            amountchanged = amountinpounds*NigerianNaira;
            break;
            case "Norway":
            amountchanged = amountinpounds*NorwagianKrone;
            break;
            case "Phillipine":
            amountchanged = amountinpounds*PhillipinePeso;
            break;
            case "Qatar":
            amountchanged = amountinpounds*QatariRial;
            break;
            case "Romania":
            amountchanged = amountinpounds*RomanianLeu;
            break;
            case "SaudiaArabia":
            amountchanged = amountinpounds*SaudiRial;
            break;
            case "Serbia":
            amountchanged = amountinpounds*SerbianDinar;
            break;
            case "SriLanka":
            amountchanged = amountinpounds*SrilankanRupees;
            break;
            case "Sweden":
            amountchanged = amountinpounds*SwedishKrona;
            break;
            case "Taiwan":
            amountchanged = amountinpounds*TaiwanDollars;
            break;
            case "Ukraine":
            amountchanged = amountinpounds*UkarineHryvnia;
            break;
            case "UAE":
            amountchanged = amountinpounds*UAEDirham;
            break;
            case "Zimbabwe":
            amountchanged = amountinpounds*ZimbabweDollars;
            break;
            default:
            amountchanged = amountinpounds*0.0;
            
        }

        String value = String.format("%.2f", amountchanged);
        t2.setText(value);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        firstcountry.setSelectedIndex(0);
        secondcountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void secondcountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondcountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondcountryActionPerformed

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
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox firstcountry;
    private javax.swing.JLabel firstcurrencyunit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox secondcountry;
    private javax.swing.JLabel secondcurrencyunit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
