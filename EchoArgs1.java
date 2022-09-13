/*
  Echo Arguments #1 - Echo Command-Line Parameters on Standard Error
  Written by: Keith Fenske, http://kwfenske.github.io/
  Tuesday, 9 October 2007
  Java class name: EchoArgs1
  Copyright (c) 2007 by Keith Fenske.  Apache License or GNU GPL.

  This is a trivial Java 1.4 console application to print all command-line
  parameters on standard error, when debugging scripts or what MS-DOS calls
  "batch" files.  Invoke this program instead of a real Java application until
  you are certain that a command file (script) is passing the correct
  arguments.  There is no graphical interface (GUI) for EchoArgs; it must be
  run from a command prompt, command shell, or terminal window.

  We usually think of applications as programs that run, do a job for us, and
  then finish.  On large systems especially web servers, applications run for
  someone else, produce output that may be input for another program, and
  return status to the system.  Each time an application is run, there may be
  different parameters telling the program what to do, and those parameters are
  provided as arguments on the command line.  One of the easiest mistakes to
  make is passing the wrong parameters.

  Assume that you have a serious Java application that is normally run with a
  command line similar to the following:

      java  SeriousApp27  //server/requests  update  2007-10-31

  Further assume that this command is generated from within a script that
  substitutes the current date.  You want to see what is getting passed to
  "SeriousApp27" without actually running that program, because incorrect
  parameters might cause a problem.  So you replace the name of the real
  application with EchoArgs:

      java  EchoArgs1  //server/requests  update  2007-10-31

  EchoArgs will nicely tell you that the command-line parameters are:

      EchoArgs1 called, args.length = 3
      EchoArgs1 args[0] = <//server/requests>
      EchoArgs1 args[1] = <update>
      EchoArgs1 args[2] = <2007-10-31>

  Once this is correct, change your script to invoke the real program.
  EchoArgs only prints the arguments; it does not otherwise execute or
  interpret them.  It may be used with any command file, but is most useful as
  a placeholder for other Java applications, because Java has its own way of
  parsing command lines and expanding file name patterns.  (This document might
  be the longest explanation yet written for a trivial program.)

  Apache License or GNU General Public License
  --------------------------------------------
  EchoArgs1 is free software and has been released under the terms and
  conditions of the Apache License (version 2.0 or later) and/or the GNU
  General Public License (GPL, version 2 or later).  This program is
  distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY,
  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
  PARTICULAR PURPOSE.  See the license(s) for more details.  You should have
  received a copy of the licenses along with this program.  If not, see the
  http://www.apache.org/licenses/ and http://www.gnu.org/licenses/ web pages.
*/

public class EchoArgs1
{
  public static void main(String[] args)
  {
    System.err.println("EchoArgs1 called, args.length = " + args.length);
    for (int i = 0; i < args.length; i ++)
      System.err.println("EchoArgs1 args[" + i + "] = <" + args[i] + ">");

  } // end of main() method

} // end of EchoArgs1 class

/* Copyright (c) 2007 by Keith Fenske.  Apache License or GNU GPL. */
