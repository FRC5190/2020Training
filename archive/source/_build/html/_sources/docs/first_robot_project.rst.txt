Your First Robot Project
========================

Let's now create your first robot project. All robot projects use a build system called `Gradle <https://gradle.org/>`_. 
This build system allows us to retrieve dependencies from any online source. For example, if we wanted to use Team 254's library, we can simply add it with one line to the
``build.gradle`` instead of having to download it manually.

Furthermore, we can package and deploy all of our robot code to the robot with one task.

Overview of RobotTemplate
-------------------------

``RobotTemplate`` is a repository created by Team 5190 that contains the basic template for every robot that we program. A link to this repository is available `here <https://github.com/5190GreenHopeRobotics/RobotTemplate>`_. 

Forking RobotTemplate
---------------------

We will first "fork" this repository and create your own copy. Open https://github.com/5190GreenHopeRobotics/RobotTemplate in your browser. Select ``fork`` button in the upper right corner. This will create a copy of this repository under your own GitHub account. You will be redirected to your forked copy. Notice that the URL of this repository will be something like https://github.com/your-account/RobotTemplate.

Now, you will clone the repository to your local computer. Throughout your programming career at Team 5190, you will extensively use the command line. You should start to feel comfortable using the command line.

Open a terminal window of your choice (PowerShell, Terminal, iTerm, etc.) and ``cd`` to the directory where you wish to clone the project. Then run the following command:

``git clone https://github.com/your-account/RobotTemplate``

This will create a copy of the robot template project. You can ``cd`` into ``RobotTemplate`` and see its contents:

.. image:: images/robot_template_ls.png

Opening RobotTemplate in IntelliJ IDEA
--------------------------------------
We will now open this project in our IDE, IntelliJ. Open IntelliJ IDEA. If you are opening it for the first time, you will be prompted for themes and plugins. Choose the theme of your choice and then skip extra plugins and choose defaults.

Now, click on the ``Open`` option on the startup screen. Navigate to where your ``RobotTemplate`` project is stored and click on the Calculator.main ``RobotTemplate`` folder. A Gradle window like the one in the image below should pop up. These default options should be fine. Click ``Ok`` and continue.

.. image:: images/intellij_gradle_window.png









