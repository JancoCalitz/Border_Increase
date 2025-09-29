# BorderIncreasePlugin

BorderIncreasePlugin is a lightweight utility plugin for Paper/Spigot servers.  
It introduces a simple command that dynamically expands the Minecraft world border, ideal for progressive survival servers, event servers, or custom game modes.

## Overview
This plugin allows administrators (or players with the right permission) to increase the size of the world border using a single command.  
The amount of expansion and the target world can be customised via the plugin’s `config.yml`, making it easy to adapt to different server setups.

## Features
- `/increaseborder` command to expand the world border.  
- Fully configurable expansion size (`border-increase-amount`).  
- Configurable target world (`world-name`).  
- Permission-based control (`borderincrease.use`).  
- Lightweight and performance-friendly.  

## Commands & Permissions
| Command            | Permission            | Description                           |
|--------------------|-----------------------|---------------------------------------|
| `/increaseborder`  | `borderincrease.use`  | Increases the world border by the configured amount. |

## Technical
- **Minecraft:** Spigot/Paper 1.21.1  
- **Language:** Java 21  
- **Build Tool:** Maven  

## Installation
1. Build the plugin with Maven (`mvn clean package`) or use a precompiled JAR.  
2. Place the JAR into your server’s `plugins/` directory.  
3. Start the server to generate the `config.yml`.  
4. Adjust configuration values as needed.  
5. Use `/increaseborder` in-game (with permission).  

---

## License & Usage
This plugin was developed by **Penta** and is shown here for demonstration purposes. Rights reserved.
