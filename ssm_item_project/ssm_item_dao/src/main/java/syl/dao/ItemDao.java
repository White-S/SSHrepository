package syl.dao;


import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import syl.domain.Items;

import java.util.List;

public interface ItemDao {
    @Select("select * from items")
    List<Items> finAll();

    @Update("update items set name=#{name},price=#{price},pic=#{pic},createtime=#{createtime},detail=#{detail} where id = #{id}")
    void updateItems(Items items);

    @Select("select * from items where id= #{id}")
    Items findByid(String id);
}
