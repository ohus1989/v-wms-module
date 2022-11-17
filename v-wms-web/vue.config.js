// const { defineConfig } = require('@vue/cli-service')
module.exports = {
  devServer: {
    proxy: {
      '^/v1': {
        target: 'http://localhost:8090',
      },
    },
  },
}
