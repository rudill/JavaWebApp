/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [ './src/**/*.html', './src/**/*.jsp' ],
  theme: {

    extend: {

    },
  },
  plugins: [
    require("daisyui")
  ],
}

