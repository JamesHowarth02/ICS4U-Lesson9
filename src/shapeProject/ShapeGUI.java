/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author jame1850
 */
public class ShapeGUI extends javax.swing.JFrame {

    /**
     * Creates new form ShapeGUI
     */
    
    StandardPen pen;
    Shape shape;
    SketchPadWindow window;
    
    public ShapeGUI() {
        initComponents();
        window = new SketchPadWindow(400, 400);
        window.setLocation(50, 325);
        pen = new StandardPen(window);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCircle = new javax.swing.JButton();
        btnWheel = new javax.swing.JButton();
        btnTriangle = new javax.swing.JButton();
        btnRectangle = new javax.swing.JButton();
        optionLabel = new javax.swing.JLabel();
        selectShapeLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnMove = new javax.swing.JButton();
        btnResize = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        detailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCircle.setText("Circle");
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });

        btnWheel.setText("Wheel");
        btnWheel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWheelActionPerformed(evt);
            }
        });

        btnTriangle.setText("Triangle");
        btnTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriangleActionPerformed(evt);
            }
        });

        btnRectangle.setText("Rectangle");
        btnRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectangleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCircle)
                .addGap(28, 28, 28)
                .addComponent(btnWheel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnRectangle)
                .addGap(27, 27, 27)
                .addComponent(btnTriangle)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCircle, btnRectangle, btnTriangle, btnWheel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCircle)
                    .addComponent(btnWheel)
                    .addComponent(btnTriangle)
                    .addComponent(btnRectangle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCircle, btnRectangle, btnTriangle, btnWheel});

        optionLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optionLabel.setText("Shape Options");

        selectShapeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectShapeLabel.setText("Select a Shape:");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnMove.setText("Move");
        btnMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveActionPerformed(evt);
            }
        });

        btnResize.setText("Resize");
        btnResize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResizeActionPerformed(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnResize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuit, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMove, btnQuit, btnResize});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuit)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        detailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        detailLabel.setText("Shape Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectShapeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(optionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(detailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(selectShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void erase() {
        if(shape != null) {
            pen.setColor(Color.white);
            shape.draw(pen);
            pen.setColor(Color.blue);
        }
    }
    
    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircleActionPerformed
        erase();
        shape = new Circle(0, 0, 50);
        shape.draw(pen);
        outputArea.setText(shape.toString());
    }//GEN-LAST:event_btnCircleActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
        erase();
        double x = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new x", "0"));
        double y = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new Y", "0"));
        shape.move(x, y);
        shape.draw(pen);
        outputArea.setText(shape.toString());
    }//GEN-LAST:event_btnMoveActionPerformed

    private void btnWheelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWheelActionPerformed
        erase();
        shape = new Wheel(0, 0, 50, 5);
        shape.draw(pen);
        outputArea.setText(shape.toString());
    }//GEN-LAST:event_btnWheelActionPerformed

    private void btnRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectangleActionPerformed
        erase();
        shape = new Rect(-50, 50, 50, 100);
        shape.draw(pen);
        outputArea.setText(shape.toString());
    }//GEN-LAST:event_btnRectangleActionPerformed

    private void btnTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriangleActionPerformed
        erase();
        shape = new Triangle(-50, 0, 50);
        shape.draw(pen);
        outputArea.setText(shape.toString());
    }//GEN-LAST:event_btnTriangleActionPerformed

    private void btnResizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResizeActionPerformed
        erase();
        double factor = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter stretchBy factor:", "0"));
        shape.stretchBy(factor);
        shape.draw(pen);
        outputArea.setText(shape.toString());
    }//GEN-LAST:event_btnResizeActionPerformed

    //@param args the command line arguments
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
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ShapeGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCircle;
    private javax.swing.JButton btnMove;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRectangle;
    private javax.swing.JButton btnResize;
    private javax.swing.JButton btnTriangle;
    private javax.swing.JButton btnWheel;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel optionLabel;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel selectShapeLabel;
    // End of variables declaration//GEN-END:variables
}
