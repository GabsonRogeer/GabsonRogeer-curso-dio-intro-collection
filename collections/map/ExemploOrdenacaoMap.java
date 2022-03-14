package collections.map;

import java.util.*;
import java.util.Map.Entry;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
Autor = Cortella, Mário Sergio - Livro = Por que Fazemos o que Fazemos?, páginas: 176
Autor = Cortella, Mário Sergio - Livro = Qual é a tua obra?, páginas: 144
*/

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo.", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito.", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            put("Cortella, Mário Sergio", new Livro("Por que Fazemos o que Fazemos?", 176));
            put("Cortella, Mário Sergio", new Livro("Qual é a tua obra?", 144));
        }};

        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo.", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito.", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            put("Cortella, Mário Sergio", new Livro("Por que Fazemos o que Fazemos?", 176));
            //put("Cortella, Mário Sergio", new Livro("Qual é a tua obra?", 144));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> entry : meusLivros3) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem número de página\t--"); //Pra você

        Set<Map.Entry<Integer, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll((Collection<? extends Entry<Integer, Livro>>) meusLivros.entrySet());
        for (Entry<Integer,Livro> entry : meusLivros4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getPaginas());
        }
    }  
}

class Livro {
   
    String nome;
    public Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<Integer, Livro>>{

    @Override
    public int compare(Entry<Integer, Livro> l1, Entry<Integer, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}