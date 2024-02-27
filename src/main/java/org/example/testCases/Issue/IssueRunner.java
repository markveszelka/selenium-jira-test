package org.example.testCases.Issue;

import org.example.LogIn;

public class IssueRunner {
    private final LogIn logIn;
    private final CreateIssue createIssue;
    private final SearchIssue searchIssue;
    private final EditIssue editIssue;
    private final DeleteIssue deleteIssue;

    public IssueRunner(LogIn logIn, CreateIssue createIssue, SearchIssue searchIssue, EditIssue editIssue, DeleteIssue deleteIssue) {
        this.logIn = logIn;
        this.createIssue = createIssue;
        this.searchIssue = searchIssue;
        this.editIssue = editIssue;
        this.deleteIssue = deleteIssue;
    }

    public void creatIssue() {
        logIn.logIn();
        createIssue.run();
        searchIssue.run();
        deleteIssue.run();
    }

    public void searchIssue() {
        logIn.logIn();
        createIssue.run();
        searchIssue.run();
        deleteIssue.run();
    }

    public void editIssue() {
        logIn.logIn();
        createIssue.run();
        searchIssue.run();
        editIssue.run();
        deleteIssue.run();
    }

    public void deleteIssue() {
        logIn.logIn();
        createIssue.run();
        searchIssue.run();
        deleteIssue.run();
    }
}
