package review;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
public class MainDBC {
	
		List <BookDBC> favorites = new ArrayList <BookDBC>();
		
		@Test
		public void testBooks() {
			
			BookDBC b1 = new BookDBC ("title1",11,false);
			BookDBC b2 = new BookDBC ("title2",11,false);
			BookDBC b3 = new BookDBC ("title3",11,false);
			
			List <BookDBC> temp = new ArrayList<BookDBC>();
			
			temp.add(b1);
			temp.add(b2);
			temp.add(b3);
		
			merge(temp);
			
		}
		
		public void merge(List<BookDBC>listOfBooksFromTemp) {
			
			assert !listOfBooksFromTemp.isEmpty() : " is empty";
			
			favorites.addAll(listOfBooksFromTemp);
			
			assert !favorites.isEmpty() : " favorite is empty";
			
		}
	}

