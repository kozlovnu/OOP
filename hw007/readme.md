Создаем контакт с пустыми 

Contact = состоит из словаря, содержит ключ ContactName (id, name) и значения contactMethod 
ContactName = класс, содержит поля id, name
ContactList = list, содержит коллекцию словарей Map контактных методов (adress, phone, tg, vk, email)

Contact = Map<Contact, ContactList>
Contact = id, name
ContactList = List<AdressContact, EmailContact, PhoneNumberContact, TelegramContact, VkPageContact>
Contact