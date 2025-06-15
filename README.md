# Message of the Day (MOTD) Plugin

A lightweight and intuitive Minecraft plugin that allows server administrators to view and update the Message of the Day (MOTD) dynamically using a simple command. Built using the [Imperat](https://github.com/VelixDevelopments/Imperat) command framework, this plugin ensures your server's MOTD appears both in-game and on the server list — with full color support and permission control.

---

## 🔥 Features

- ✅ **Edit MOTD Live**: Update the MOTD instantly without restarting the server.
- 🌐 **Shown in Server List**: The MOTD updates what players see in their multiplayer list.
- 💾 **Saved Automatically**: New MOTDs are stored in `config.yml` and reloaded at startup.
- 🔐 **Permission-Controlled**: Only users with `motd.set` permission can update the message.
- 🎨 **Color Support**: Supports `&` Minecraft color codes.

---

## 🧾 Commands

| Command | Description |
|---------|-------------|
| `/motd` | Shows the current MOTD. |
| `/motd set <message>` | Changes the MOTD to a new message (requires permission). |

### 🔍 Usage Examples
```text
> /motd
The message of the day is &aWelcome to our server!

> /motd set &bEnjoy your stay!
The message of the day has been set to &bEnjoy your stay!
```

---

## ⚙️ Configuration

After first launch, the plugin generates a `config.yml`:
```yaml
MOTD: "Welcome to our server!"
```
You can also update the message via `/motd set <message>` — it will be saved automatically.

### 🎨 Color Codes

Use `&` followed by a color code:

| Code | Color Name     | Preview                |
|------|----------------|------------------------|
| &0   | Black          | §0Black                |
| &1   | Dark Blue      | §1Dark Blue            |
| &2   | Dark Green     | §2Dark Green           |
| &3   | Dark Aqua      | §3Dark Aqua            |
| &4   | Dark Red       | §4Dark Red             |
| &5   | Dark Purple    | §5Dark Purple          |
| &6   | Gold           | §6Gold                 |
| &7   | Gray           | §7Gray                 |
| &8   | Dark Gray      | §8Dark Gray            |
| &9   | Blue           | §9Blue                 |
| &a   | Green          | §aGreen                |
| &b   | Aqua           | §bAqua                 |
| &c   | Red            | §cRed                  |
| &d   | Light Purple   | §dLight Purple         |
| &e   | Yellow         | §eYellow               |
| &f   | White          | §fWhite                |

---

## 🔐 Permissions

To allow a player to change the MOTD, grant them this permission:
```
motd.set
```
Only users with this permission will be able to use `/motd set <message>`.

---

## 📦 Installation

1. Place the `MOTD.jar` plugin in your server's `plugins/` folder.
2. Start or reload the server.
3. The MOTD will automatically be pulled from the config file and displayed.

---

## 📄 License

Licensed under the [MIT License](LICENSE).

---

> Made with ❤️ by **Mohamed Badawy**

