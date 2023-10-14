
package Responsibility;


import DataAccess.PersonDAO;

public class PersonReposibility implements IPersonReposibility{
    @Override
    public void findPersonInfo() {
        PersonDAO.Instance().findPersonInfo();
    }

    @Override
    public void copyNewFile() {
        PersonDAO.Instance().copyNewFile();
    }
}