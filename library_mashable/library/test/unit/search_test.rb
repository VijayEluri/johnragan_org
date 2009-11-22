require File.dirname(__FILE__) + '/../test_helper'

class SearchTest < ActiveSupport::TestCase
  def test_basics_while_constructing
    search_library = SearchLibrary.new
    book_records = search_library.books_in_library("moscow rules")
    assert_equal 5, book_records.size
    
    assert_equal 1, book_records[0].ranking
    assert_equal 2, book_records[1].ranking
    assert_equal 3, book_records[2].ranking
    assert_equal 4, book_records[3].ranking
    assert_equal 5, book_records[4].ranking
  end

  def test_get_library_valid_title
    search_library = SearchLibrary.new
    # data = search_library.books_in_library("moscow rules")
    #     assert data =~ /moscow rules/
  end
  
  def test_get_library_invalid_title
    return
    search_library = SearchLibrary.new
    # data = search_library.books_in_library("asersdfa asfdknewrl")
    #     assert data =~ /asersdfa asfdknewrl/
  end
  
  def test_get_library_out_of_stock_title
    true
  end
  
  def test_get_library_down_for_maintenance
    true
  end
  
  def test_get_library_only_in_zoperations
    true
  end
  
  def test_session_expired
    # Your session has timed out.

    #Please click OK to start a new session.
  end
  
  def test_multiple_books_same_title
  end
  
  def test_same_book_different_versions
  end  
  
  def test_book_pagination
  end
  
  def test_unable_to_access_server
  end
end