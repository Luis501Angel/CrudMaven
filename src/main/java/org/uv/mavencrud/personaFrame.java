package org.uv.mavencrud;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Angel
 */
public class personaFrame extends personaGUI<Persona, interfaceDAO<Persona, Integer>> {
    public personaFrame(String title, Persona object, interfaceDAO<Persona, Integer> provider, String... fields) {
        super(title, object, provider, fields);
    }

    @Override
    public void insert() {
        object.setId(Integer.parseInt(this.objectProperties.get("Id").getText()));
        object.setName(this.objectProperties.get("Name").getText());
        object.setAddress(this.objectProperties.get("Address").getText());
        object.setPhone(this.objectProperties.get("Phone").getText());

        if (!provider.insert(object)) {
            JOptionPane.showMessageDialog(null, "There was an error", "", 0);
            return;
        }

        clear();
    }

    @Override
    public void update() {
        object.setId(Integer.parseInt(this.objectProperties.get("Id").getText()));
        object.setName(this.objectProperties.get("Name").getText());
        object.setAddress(this.objectProperties.get("Address").getText());
        object.setPhone(this.objectProperties.get("Phone").getText());

        if (!provider.update(object)) {
            JOptionPane.showMessageDialog(null, "There was an error", "", 0);
            return;
        }

        clear();
    }

    @Override
    public void delete() {
        if (provider.delete(Integer.parseInt(this.objectProperties.get("Id").getText()))) {
            JOptionPane.showMessageDialog(null, "There was an error", "", 0);
            return;
        }

        clear();
    }

    @Override
    public void find() {
        object = provider.find(Integer.parseInt(this.objectProperties.get("Id").getText()));

        if (object != null) {
            this.objectProperties.get("Id").setText(Integer.toString(object.getId()));
            this.objectProperties.get("Name").setText(object.getName());
            this.objectProperties.get("Address").setText(object.getAddress());
            this.objectProperties.get("Phone").setText(object.getPhone());
        }
    }

    @Override
    public void updateTable() {
        list = provider.findAll();

        tableModel.setRowCount(list.size());

        for (int i = 0; i < list.size(); i++) {
            tableModel.setValueAt(Integer.toString(list.get(i).getId()), i, 0);
            tableModel.setValueAt(list.get(i).getName(), i, 1);
            tableModel.setValueAt(list.get(i).getAddress(), i, 2);
            tableModel.setValueAt(list.get(i).getPhone(), i, 3);
        }
    }

    @Override
    public void getSelection() {
        selectedRow = table.getSelectedRow();

        if (selectedRow > -1) {
            this.objectProperties.get("Id").setText(table.getValueAt(selectedRow, 0).toString());
            this.objectProperties.get("Name").setText(table.getValueAt(selectedRow, 1).toString());
            this.objectProperties.get("Address").setText(table.getValueAt(selectedRow, 2).toString());
            this.objectProperties.get("Phone").setText(table.getValueAt(selectedRow, 3).toString());
        }
    }
}
