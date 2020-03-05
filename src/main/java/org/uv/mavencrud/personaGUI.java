package org.uv.mavencrud;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Luis Angel
 * @param <T> Data type
 * @param <S> Data provider
 */
public abstract class personaGUI<T, S> extends javax.swing.JInternalFrame
{   
    // Frame properties
    private int row;
    private int column;
    private Insets insets;
    private GridBagConstraints gridBagConstraints;
    protected Map<String, JTextField> objectProperties;
    
    // Table properties
    protected int selectedRow;
    protected DefaultTableModel tableModel;
    
    // Data properties
    protected T object;
    protected S provider;
    protected List<T> list;
    
    private personaGUI()
    {
        initComponents();
    }
    
    public personaGUI(String title, T object, S provider, String... fields)
    {
        this();
        init(title, object, provider, fields);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crudPanel = new javax.swing.JPanel();
        insertarB = new javax.swing.JButton();
        actualizarB = new javax.swing.JButton();
        buscarB = new javax.swing.JButton();
        borrarB = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        tableContainer = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        optionsPanel = new javax.swing.JPanel();
        autoActualizacion = new javax.swing.JRadioButton();
        actualizarTabla = new javax.swing.JButton();
        widgetsContainer = new javax.swing.JScrollPane();
        widgets = new javax.swing.JPanel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setName(""); // NOI18N

        insertarB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        insertarB.setText("Insertar");
        insertarB.setPreferredSize(new java.awt.Dimension(150, 30));
        insertarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBActionPerformed(evt);
            }
        });
        crudPanel.add(insertarB);

        actualizarB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        actualizarB.setText("Actualizar");
        actualizarB.setPreferredSize(new java.awt.Dimension(150, 30));
        actualizarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBActionPerformed(evt);
            }
        });
        crudPanel.add(actualizarB);

        buscarB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buscarB.setText("Buscar");
        buscarB.setPreferredSize(new java.awt.Dimension(150, 30));
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });
        crudPanel.add(buscarB);

        borrarB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        borrarB.setText("Borrar");
        borrarB.setPreferredSize(new java.awt.Dimension(150, 30));
        borrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBActionPerformed(evt);
            }
        });
        crudPanel.add(borrarB);

        tablePanel.setBackground(new java.awt.Color(0, 255, 255));
        tablePanel.setPreferredSize(new java.awt.Dimension(625, 300));
        tablePanel.setLayout(new java.awt.BorderLayout());

        tableContainer.setBorder(null);
        tableContainer.setPreferredSize(new java.awt.Dimension(450, 400));

        table.setAutoCreateColumnsFromModel(false);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        tableContainer.setViewportView(table);

        tablePanel.add(tableContainer, java.awt.BorderLayout.CENTER);

        autoActualizacion.setText("Auto. Actualización");
        autoActualizacion.setPreferredSize(new java.awt.Dimension(150, 30));
        autoActualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoActualizacionActionPerformed(evt);
            }
        });
        optionsPanel.add(autoActualizacion);

        actualizarTabla.setText("Actualizar tabla");
        actualizarTabla.setPreferredSize(new java.awt.Dimension(150, 30));
        actualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarTablaActionPerformed(evt);
            }
        });
        optionsPanel.add(actualizarTabla);

        tablePanel.add(optionsPanel, java.awt.BorderLayout.PAGE_START);

        widgetsContainer.setBorder(null);

        widgets.setLayout(new java.awt.GridBagLayout());
        widgetsContainer.setViewportView(widgets);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crudPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addComponent(widgetsContainer)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(crudPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(widgetsContainer)
                .addGap(0, 0, 0)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_borrarBActionPerformed
    {//GEN-HEADEREND:event_borrarBActionPerformed
        delete();
        autoUpdate();
    }//GEN-LAST:event_borrarBActionPerformed

    private void insertarBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_insertarBActionPerformed
    {//GEN-HEADEREND:event_insertarBActionPerformed
        insert();
        autoUpdate();
    }//GEN-LAST:event_insertarBActionPerformed

    private void actualizarBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_actualizarBActionPerformed
    {//GEN-HEADEREND:event_actualizarBActionPerformed
        update();
        autoUpdate();
    }//GEN-LAST:event_actualizarBActionPerformed

    private void buscarBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buscarBActionPerformed
    {//GEN-HEADEREND:event_buscarBActionPerformed
        find();
    }//GEN-LAST:event_buscarBActionPerformed
    
    private void tableMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableMousePressed
    {//GEN-HEADEREND:event_tableMousePressed
        getSelection();
    }//GEN-LAST:event_tableMousePressed

    private void tableKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tableKeyPressed
    {//GEN-HEADEREND:event_tableKeyPressed
        getSelection();
    }//GEN-LAST:event_tableKeyPressed

    private void actualizarTablaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_actualizarTablaActionPerformed
    {//GEN-HEADEREND:event_actualizarTablaActionPerformed
        updateTable();
    }//GEN-LAST:event_actualizarTablaActionPerformed

    private void autoActualizacionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_autoActualizacionActionPerformed
    {//GEN-HEADEREND:event_autoActualizacionActionPerformed
        if(!autoActualizacion.isSelected())
        {
            actualizarTabla.setEnabled(true);
        }
        else
        {
            actualizarTabla.setEnabled(false);
        }
        
        updateTable();
    }//GEN-LAST:event_autoActualizacionActionPerformed
    
    // Crud methods
    public abstract void insert();
    public abstract void update();
    public abstract void delete();
    public abstract void find();
    
    // Table methods
    public abstract void updateTable();
    public abstract void getSelection();
    
    // Other
    public void clear()
    {
        List<JTextField> fields = new ArrayList<>(objectProperties.values());
        
        fields.forEach(field -> field.setText(""));
    }
    
    private void init(String title, T model, S service, String... fields)
    {   
        // Set title
        
        setTitle(title);
        
        // Init row and column
        
        row = 0;
        column = -1;
        
        insets = new Insets(10, 10, 10, 10);
        
        gridBagConstraints = new GridBagConstraints();
        
        gridBagConstraints.ipadx = 0;
        gridBagConstraints.ipady = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        
        // Init fields
        
        this.objectProperties = new HashMap<>();
        
        for (String field : fields)
        {
            addComponents(field);
        }
       
        this.object = model;
        this.provider = service;  
        
        // Init table
        
        tableModel = new DefaultTableModel(fields, 0)
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };

        table.setModel(tableModel);
        
        updateTable();
    }
    
    private void addComponents(String labelText)
    {
        JTextField field = new JTextField();
        JLabel label = new JLabel();
        
        field.setPreferredSize(new Dimension(100, 30));
        label.setPreferredSize(new Dimension(100, 30));
        
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        
        label.setText(labelText);
        
        column++;
        addComponent(label);
        column++;
        addComponent(field);
        
        if(column >= 3)
        {
            row++;
            column = -1;
        }
        
        objectProperties.put(labelText, field);
        widgets.revalidate();
    }
    
    private void addComponent(Component component)
    {
        gridBagConstraints.gridx = column;
        gridBagConstraints.gridy = row;
        gridBagConstraints.insets = insets;
        widgets.add(component, gridBagConstraints);
    }
   
    private void autoUpdate()
    {
        if(autoActualizacion.isSelected())
        {
            updateTable();
        }
    }
    
    @Override
    public void hide()
    {
        if(table != null)
        {
            table.clearSelection();
            clear();
        }
        
        super.hide();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarB;
    private javax.swing.JButton actualizarTabla;
    private javax.swing.JRadioButton autoActualizacion;
    private javax.swing.JButton borrarB;
    private javax.swing.JButton buscarB;
    private javax.swing.JPanel crudPanel;
    private javax.swing.JButton insertarB;
    private javax.swing.JPanel optionsPanel;
    protected javax.swing.JTable table;
    private javax.swing.JScrollPane tableContainer;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JPanel widgets;
    private javax.swing.JScrollPane widgetsContainer;
    // End of variables declaration//GEN-END:variables
}
