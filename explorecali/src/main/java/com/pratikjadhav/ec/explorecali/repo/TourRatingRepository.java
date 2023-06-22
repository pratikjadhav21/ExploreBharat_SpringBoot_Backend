package com.pratikjadhav.ec.explorecali.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pratikjadhav.ec.explorecali.domain.TourRating;

/**
 * Tour Rating Repository Interface
 *
 * Created by Pratik Jadhav
 */
@RepositoryRestResource(exported = false)
public interface TourRatingRepository extends CrudRepository<TourRating, String> {

	/**
	 * Lookup all the TourRatings for a tour.
	 *
	 * @param tourId is the tour Identifier
	 * @return a List of any found TourRatings
	 */
	List<TourRating> findByTourId(String tourId);

	/**
	 * Lookup a TourRating by the TourId and Customer Id
	 * 
	 * @param tourId     tour identifier
	 * @param customerId customer identifier
	 * @return Optional of found TourRatings.
	 */
	Optional<TourRating> findByTourIdAndCustomerId(String tourId, Integer customerId);

	/**
	 * Fetch a Page of TourRatings
	 *
	 * @param tourId   the tour identifier
	 * @param pageable info to determine page
	 * @return Page of Tour Ratings
	 */
	Page<TourRating> findByTourId(String tourId, Pageable pageable);
}