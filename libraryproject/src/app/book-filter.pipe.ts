import { PipeTransform, Pipe} from '@angular/core';

interface Book{
    bookId:number;
    bookName:string;
    authorName:string;
    bookCategory:string;
    bookPublisher:string;
}
@Pipe({
    name:'bookFilter'
})
export class BookFilterPipe implements PipeTransform{
    transform(bookDetails:Book[],search: string):Book[]{
        if(search===undefined){
            return bookDetails;
        }else{
            return bookDetails.filter(book=>{
                return book.bookName.toLowerCase().includes(search.toLowerCase())||
                        book.authorName.toLowerCase().includes(search.toLowerCase())||
                        book.bookCategory.toLowerCase().includes(search.toLowerCase());
            });
        }
        
    }
}