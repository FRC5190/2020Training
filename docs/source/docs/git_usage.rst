Git Usage
=========

Creating A Feature Branch
-------------------------
Often times, you will be assigned a subsystem or a specific task to complete for the robot code. Since the ``master`` branch is used only for stable code, you should develop your task-specific code on a separate branch. To create a separate branch, use the following command:

``git checkout -b your-branch-name``

This will create and checkout the new branch. As you work on your new feature, remember to create atomic commits. As mentioned above, these are short and descriptive commits that explain what that specific piece of code does. Once you are ready to push a certain batch of commits to your branch, you can use the following command.

``git push --set-upstream origin your-branch-name``

You only need to run the command above once. After the first time, you can simply use ``git push`` to push your commits to GitHub.

Updating a Feature Branch
-------------------------
When you are working on your feature branch, other changes might be pushed to ``master``. How do you update your branch with new commits from ``master``? We use a strategy called rebase and force push. 

First, fetch the new commits: ``git fetch -p origin``
Then, rebase on top of master: ``git rebase origin/master``
Force push the changes to your feature branch: ``git push --force``

Rebasing takes your branch-specific commits and replays them on top of the incoming commits from ``master``. When you replay the changes, a new commit hash is generated. Because these hashes are different from the hashes upstream (on GitHub), you have to forcefully update the upstream branch. This is why we need to use ``git push --force`` instead of just ``git push``.
