package nmy.Jack.entity;

import lombok.Data;

import java.util.List;

@Data
public class Roomentitiy {
    String id;
    List<Userentitiy> userentitiy;
}
