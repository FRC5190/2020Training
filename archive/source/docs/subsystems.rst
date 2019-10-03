Creating Subsystems
===================
It is preferred that you create subsystems in a separate package called ``subsystems`` in the ``org.ghrobotics.frc2020`` package.

We will use singleton objects for every subsystem. This makes sure that no subsystem is accidentally created more than once. To declare a singleton in Kotlin, we use the ``object`` keyword.

.. code-block:: kotlin

    object MySubsystem : FalconSubsystem() {
        ...
    }

FalconSubsystem base class
--------------------------

Every subsystem that we create extends the ``FalconSubsystem`` `base class <https://github.com/5190GreenHopeRobotics/FalconLibrary/blob/2020/wpi/src/calculator.calculator.main/kotlin/org/ghrobotics/lib/commands/FalconSubsystem.kt>`_. This base class has methods ``lateInit()``, ``autoReset()``, ``teleopReset()``, and ``setNeutral()`` which can be overriden.

 - ``lateInit()``: This method is run when ``robotInit()`` is called.
 - ``autoReset()``: This method is run when autonomous begins.
 - ``teleopReset()``: This method is run when teleop begins.
 - ``setNeutral()``: This method is run when the robot is disabled to zero all outputs on the subsystem.


Registering a subsystem
-----------------------

We need to register each subsystem into the ``FalconSubsystemHandler`` so that the methods described above can be called automatically. We register each subsystem in the calculator.calculator.main ``Robot.kt`` file. In the constructor of ``Robot.kt``, we register the subsystem as follows:

.. code-block:: kotlin

    object Robot : FalconTimedRobot() {
        init {
            +MySubsystem
        }
    }

When you call ``+`` on the subsystem, the subsystem is instantiated and added to the ``FalconSubsystemHandler``. The ``FalconSubsystemHandler`` will call the four methods automatically as described above.
