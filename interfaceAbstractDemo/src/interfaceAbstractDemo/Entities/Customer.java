package interfaceAbstractDemo.Entities;

import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.IEntity;

public class Customer implements IEntity{
	int id;
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
	String nationalityId;
}
