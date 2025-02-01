# React + TypeScript + Vite

This template provides a minimal setup to get React working in Vite with HMR and some ESLint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react/README.md) uses [Babel](https://babeljs.io/) for Fast Refresh
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react-swc) uses [SWC](https://swc.rs/) for Fast Refresh

## Installation Guide

### To install the latest Node.js and npm using NVM (Node Version Manager), 
follow these steps:

1. Install NVM (if not installed)
```bash
  curl -fsSL https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.5/install.sh | bash
```
Then, restart your terminal or run:
```bash
    source ~/.bashrc   # or ~/.bash_profile or ~/.zshrc depending on your shell
```
2. Install the Latest Node.js and npm
```bash
    nvm install node
```
3. Verify Installation - Check installed versions:
```bash
    node -v  # Check Node.js version
    npm -v   # Check npm version
```

4. List Installed Node Versions
```bash
    nvm list
```
5. Install a Specific Node.js Version (If Not Installed)
```bash
  nvm install <version>
```
Example:
```bash
    nvm install 16.20.2  # Installs Node.js v16.20.2
```
6. Switch to a Different Node.js Version
```bash
  nvm use <version>    
```
Example:
```bash
  nvm use 23.7.0  # Switches to Node.js v23.7.0
```
7. Uninstall a Node.js Version (If Needed)
```bash
  nvm uninstall <version>
```
Example:
```bash
  nvm uninstall 14.21.3
```

## Create React Project
```bash
  npm create vite
```

## How to run
```bash
  npm install
```

```bash
  npm run dev
```

## Install lucide
```bash
  npm install lucide-react
```

## Install Tailwinds
```bash
  npm install -D tailwindcss postcss autoprefixer
```
```bash
  npm install -D @tailwindcss/postcss
```
```bash
  npx tailwindcss init -p
```

## Clean 
```bash
  npm cache clean --force
```
```bash
  rm -rf node_modules package-lock.json
```
```bash
  npm install
```



