package com.chengzi.mapper;


import com.chengzi.bean.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper//指定这是一个操作数据库的mapper
public interface BookMapper {

    @Select("select * from book where id = #{id}")
    public Book getBookById(Integer id);

    @Delete("delete from book where id = #{id}")
    public int deleteBookById(Integer id);

    @Insert("insert into book(bname,price) values (#{bname},#{price})")
    public int insertBook(Book book);

    @Update("update book set bname=#{bname} where id=#{id}")
    public int updateBook(Book book);

}
