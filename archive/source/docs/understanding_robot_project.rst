Understanding The Robot Project
===============================

We will now take a look at the code that is in the default robot project and understand it.

Main Robot class
----------------

After opening the ``RobotTemplate`` project in IntelliJ IDEA, navigate to ``src/calculator.calculator.loops.calculator.helloWorld.main/kotlin/org/ghrobotics/frc2020/Robot.kt``. Open this file. Here you will see a list of Kotlin methods. Let's take a look at each method below.

.. code-block:: kotlin

    object Robot : FalconTimedRobot() {

        // Constructor of the Robot class.
        init {
            // Register the drivetrain into the SubsystemHandler.
            +Drivetrain
        }

        // Runs once when robot boots up
        override fun robotInit() {}

        // Runs once when autonomous period starts
        override fun autonomousInit() {}

        // Runs once when teleop period starts
        override fun teleopInit() {}

        // Runs once when robot is disabled
        override fun disabledInit() {}


        // Runs every 20 ms when robot is on
        override fun robotPeriodic() {
            Shuffleboard.update()
        }

        // Runs every 20 ms when autonomous is enabled
        override fun autonomousPeriodic() {}

        // Runs every 20 ms when teleop is enabled
        override fun teleopPeriodic() {}

        // Runs every 20 ms when robot is disabled
        override fun disabledPeriodic() {}
    }

You will quickly notice that there are four methods associated with ``init`` and four methods associated with ``periodic``.

The ``init`` methods are run once whenever the corresponding phase of the robot is entered. The ``periodic`` methods are run once every 20 milliseconds during that phase. The four "phases" are described below:

 - ``robot``: Describes the initialization of the robot code. ``robotInit`` is run once when the robot code first starts up and ``robotPeriodic`` is run every 20 milliseconds whenever the robot code is running.
 - ``autonomous``: Describes the autonomous period of the match. ``autonomousInit`` is run once when the autonomous period starts. ``autonomousPeriodic`` is run every 20 milliseconds whenever the autonomous period is enabled.
 - ``teleop``: Describes the teleoperated period of the match. ``teleopInit`` is run once when the teleoperated period starts. ``teleopPeriodic`` is run every 20 milliseconds whenever the teleoperated period is enabled.
 - ``disabled``: Describes the disabled state of the robot. ``disabledInit`` is run once whenever the robot is disabled. ``disabledPeriodic`` is run every 20 milliseconds whenever the robot is disabled.

You can see that the line ``Shuffleboard.update()`` is in the ``robotPeriodic()`` method. This means that the line ``Shuffleboard.update()`` is called every 20 milliseconds whenever the robot code is running. Do not worry about what this line does, we will get into it in later tutorials.