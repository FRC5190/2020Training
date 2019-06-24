Drivetrain Subsystem
====================

Every robot will (hopefully) have a drivetrain. Seeing this use case, ``FalconLibrary`` contains a ``TankDriveSubsystem`` base class that you can extend for creating your drivetrain subsystem. ``TankDriveSubsystem`` extends ``FalconSubsystem``, which means that the methods described in :ref:`Creating Subsystems` will still get called when registered into the ``FalconSubsystemHandler``.

