/**
 * TODO complete JavaDoc
 */
package edu.cnm.deepdive.generics;

/**
 * @author natedaag
 *
 */
public interface ShufflerSorter<T extends Comparable<T>> extends Iterable<T> {

  /**
   * 
   */
  void shuffle();
  
  /**
   * 
   */
  void sort();
  
}
