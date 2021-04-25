package gt.edu.miumg.sistemas.ingesoftware.p2.BubbleSort1;

import gt.edu.miumg.sistemas.ingesoftware.p2.BubbleSort1.Services.BubbleSort;
import gt.edu.miumg.sistemas.ingesoftware.p2.BubbleSort1.Services.IBubbleSort;
import gt.edu.miumg.sistemas.ingesoftware.p2.BubbleSort1.Services.IWordManager;
import gt.edu.miumg.sistemas.ingesoftware.p2.BubbleSort1.Services.WordManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BubbleSort1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BubbleSort1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        
        IWordManager show = new WordManager();
        show.ShowWord();
        
            
        }
    }


  

