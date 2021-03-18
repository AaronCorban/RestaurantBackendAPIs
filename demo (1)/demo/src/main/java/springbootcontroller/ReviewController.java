package springbootcontroller;

import Entities.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springbootrepository.ReviewRepository;

import java.util.List;

@CrossOrigin(origins="")//put in application url in here
@RestController
@RequestMapping("/api/v1")
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    //listing reviews
    @GetMapping("/reviews")
    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

    //saving reviews
    @PostMapping("/reviews")
    public Review createReview(@RequestBody Review review){
        return reviewRepository.save(review);
    }

}//end class
