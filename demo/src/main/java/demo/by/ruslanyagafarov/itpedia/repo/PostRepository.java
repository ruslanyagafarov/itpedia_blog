package demo.by.ruslanyagafarov.itpedia.repo;

import demo.by.ruslanyagafarov.itpedia.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {


}
