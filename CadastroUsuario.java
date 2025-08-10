import javax.swing.*; // biblioteca para criar janelas e botões
import java.awt.event.*; // biblioteca para tratar eventos (cliques, etc.)

public class CadastroUsuario {
    public static void main(String[] args) {

        // Criar a janela principal
        JFrame janela = new JFrame("Cadastro de Usuário");
        janela.setSize(300, 200); // largura, altura
        janela.setLayout(null); // posição livre dos componentes
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha o programa

        // Criar rótulos (textos fixos na tela)
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 10, 80, 25); // posição x, y, largura, altura
        janela.add(lblNome);

        JLabel lblEmail = new JLabel("E-mail:");
        lblEmail.setBounds(10, 40, 80, 25);
        janela.add(lblEmail);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(10, 70, 80, 25);
        janela.add(lblIdade);

        // Criar campos de texto (para digitar)
        JTextField txtNome = new JTextField();
        txtNome.setBounds(100, 10, 160, 25);
        janela.add(txtNome);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(100, 40, 160, 25);
        janela.add(txtEmail);

        JTextField txtIdade = new JTextField();
        txtIdade.setBounds(100, 70, 160, 25);
        janela.add(txtIdade);

        // Criar botão
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(100, 110, 100, 25);
        janela.add(btnCadastrar);

        // Evento de clique no botão
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String email = txtEmail.getText();
                String idade = txtIdade.getText();

                // Verifica se tem campo vazio
                if (nome.isEmpty() || email.isEmpty() || idade.isEmpty()) {
                    JOptionPane.showMessageDialog(janela, "Preencha todos os campos!");
                } else {
                    JOptionPane.showMessageDialog(janela,
                        "Usuário cadastrado:\n" +
                        "Nome: " + nome + "\n" +
                        "E-mail: " + email + "\n" +
                        "Idade: " + idade
                    );
                }
            }
        });

        // Mostrar a janela
        janela.setVisible(true);
    }
}
