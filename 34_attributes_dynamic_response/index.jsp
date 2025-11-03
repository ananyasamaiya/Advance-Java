<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h1>Index Page</h1>

    <hr />

    <form action="save.do">
      <p>
        <input type="text" name="student_name" placeholder="Enter your Name" />
      </p>
      <p>
        <input
          type="text"
          name="student_college"
          placeholder="Enter your College"
        />
      </p>
      <p>
        <input type="number" name="student_age" placeholder="Enter your Age" />
      </p>
      <p>
        <input
          type="text"
          name="student_marks"
          placeholder="Enter your Marks"
        />
      </p>

      <p><input type="submit" value="Save" /></p>
    </form>

    <hr />
    <a href="show.do">Show Records</a>
  </body>
</html>
