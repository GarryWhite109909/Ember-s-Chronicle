# Ember's Chronicle

------

## 📖 项目简介

Ember's Chronicle 是一款以湖湘文化为题材的3D游戏，结合TripoAI AI生成技术，为玩家提供沉浸式的文化体验。

### **剧情简介：**

- **你从灰烬中醒来，不知自己是器，是魂，还是被遗忘的回声。**
- 长沙的地窖里，三件残物静候你的选择；
   湘江的废墟上，哑女称你为“影子”；
   渡口的老船夫问：“过江的，得带自己的影子——你有吗？”
- 你穿行于他人的记忆，嗅见纸灰、桂香、窑烟……
   你记录、显形、抉择——
   却在终局得知：
   **你并非物之灵，而是人不敢带过江的那部分自己。**
- 名字，要写吗？
   影子，能成光吗？
- 在这场45分钟的湖湘幽梦中， **自我，是应该寻找，还是塑造？**

### **项目特色：**

- 🎨 基于湖湘文化的历史背景
- 🤖 TripoAI AI生成3D模型
- 🎮 Unity 3D游戏引擎
- 🌐 Spring Boot后端服务

---

## 👥 团队成员（6人）

| 角色 | 姓名 | 职责 |
|:-----|:-----|:-----|
| 后端/AI接口 | 小白 | 后端开发、TripoAI集成、API接口设计 |
| Unity主程序 | 小明 | Unity开发、3D模型处理、前端交互 |
| 叙事/关卡策划 | 阿# | 游戏剧本、关卡设计、Prompt工程 |
| 数值/工具开发 | 大帅 | 数值平衡、工具开发、自动化脚本 |
| PM/测试 | 小柏 | 项目管理、测试、文档管理 |
| 内容/技术整合 | 阿超 | 视频剪辑、分支管理，模型优化 |

---

## 🛠️ 技术栈

### 后端技术栈

- **框架**: Spring Boot 3.5.9
- **Java版本**: JDK 17
- **构建工具**: Maven 3.9.12
- **数据库**: MySQL 8.0.34
- **缓存**: Redis
- **ORM**: Spring Data JPA
- **API文档**: SpringDoc OpenAPI (Swagger)
- **配置加密**: Jasypt
- **监控**: Spring Boot Actuator
- **HTTP客户端**: OkHttp 4.12.0
- **JSON处理**: FastJSON2 2.0.43
- **AI服务**: TripoAI SDK

### 前端技术栈

- **游戏引擎**: Unity 6000.3.2f1（暂定，最终版本由小明决定）
- **叙事引擎**: Ink Unity Integration
- **输入系统**: Unity Input System 1.17.0
- **可视化调试**: Odin Inspector
- **移动端适配**: Mobile Input System
- **3D模型处理**: Blender 4.0+

### 开发工具
- **后端IDE**: IntelliJ IDEA & VS Code
- **Unity IDE**: Visual Studio 2022 Community + Resharper
- **版本控制**: Git + GitKraken
- **数据库工具**: DataGrip
- **API测试**: Postman
- **原型设计**: Figma
- **文档协作**: 腾讯文档

---

## 📁 项目结构

```
Ember_Chronicle/
├── backend/            # 后端项目
│   └── yaoyan-backend/     # Spring Boot项目
│       ├── src/
│       │   ├── main/
│       │   │   ├── java/com/yaoyan/game/
│       │   │   │   ├── common/                  # 通用类（Result、ResultCode等）
│       │   │   │   ├── config/                  # 配置类
│       │   │   │   ├── controller/              # 控制器层
│       │   │   │   ├── service/                 # 业务逻辑层
│       │   │   │   ├── repository/              # 数据访问层
│       │   │   │   ├── entity/                  # 实体类
│       │   │   │   ├── dto/                     # 数据传输对象
│       │   │   │   ├── exception/               # 异常处理
│       │   │   │   └── util/                    # 工具类
│       │   │   └── resources/
│       │   │       ├── application.yml          # 主配置文件
│       │   │       ├── application-dev.yml      # 开发环境配置
│       │   │       └── application-prod.yml     # 生产环境配置
│       │   └── test/                # 测试代码
│       └── pom.xml              # Maven配置文件
│
└── frontend/           # 前端项目
    └── Ember_Chronicle/    # Unity项目
        ├── Assets/              # Unity资源
        │   ├── Scripts/             # 所有脚本（C# + Ink）
        │   │    ├── Story/                # 阿#负责：剧本主目录（放同名的 .ink + .json）
        │   │    │    ├── chapters/             # 按“章节”组织
        │   │    │    │    ├── ch1_······/
        │   │    │    │    │        ├── ch1_······.ink
        │   │    │    │    │        └── ch1_······.json
        │   │    │    │    ├── ch2_······/
        │   │    │    │    │        ├── ch2_······.ink
        │   │    │    │    │        └── ch2_······.json
        │   │    │    │    └── ······
        │   │    │    └── common/               # 公共对话（如系统提示、通用 NPC）
        │   │    │         └── ui_messages.ink
        │   │    │
        │   │    ├── Core/                 # 小明负责：核心系统（Game Manager, State Machine）
        │   │    ├── UI/                   # 小明负责：界面逻辑
        │   │    ├── AI/                   # 小明负责：对话系统加载器（读取 .json）
        │   │    └── Utils/                # 小明/大帅负责：工具类
        │   │
        │   ├── Docs/                # 关卡/场景内容包括：布局、交互点、文化元素、氛围描述
        │   │    ├── Levels/               # 关卡/场景设计文档（每个场景一个.md 文件）
        │   │    │    ├── level_01_······.md
        │   │    │    ├── level_02_······.md
        │   │    │    └── ······
        │   │    ├── Worldbuilding/                          # 全局设定
        │   │    │    ├── lore_overview.md                   # 世界观总纲
        │   │    │    ├── characters.md                      # 主要角色档案
        │   │    │    ├── cultural_references.md             # 湖湘文化元素清单
        │   │    │    └── timeline.md                        # 游戏内时间线
        │   │    └── Narrative_Guidelines.md      # 叙事规范
        │   │
        │   ├── Prompts/             # 一个 .prompt 文件 ≈ 一个 3D 模型需求
        │   │    ├── artifacts/            # 文物类 AI 提示词
        │   │    │    ├── ······.prompt
        │   │    │    └── ······.prompt
        │   │    ├── characters/           # NPC 外观描述
        │   │    │    ├── ······.prompt
        │   │    │    └── ······.prompt
        │   │    └── environments/         # 场景氛围/建筑细节
        │   │         ├── ······.prompt
        │   │         └── ······.prompt
        │   │
        │   ├── Scenes/                  # 小明负责：Unity 场景文件
        │   ├── Models/                  # 小明负责：3D 模型（从 TripoAI 导入）
        │   ├── Prefabs/                 # 小明负责：可交互预制体（交互逻辑）
        │   ├── StreamingAssets/         # 小明负责：运行时原始数据（如 .json 副本）（Unity 会在需要时自动生成）
        │   │
        │   ├── Editor/         # 大帅负责：自动化工具（仅开发机）（自动化脚本）
        │   │
        │   ├── Plugins/               # ← 第三方插件（Unity会在需要时自动生成该文件夹）
        │   └── Resources/             # ← 动态加载资源（音频、材质等）小明管理
        │
        ├── Packages/           # Unity包
        ├── ProjectSettings/    # 项目设置
        └── UserSettings/       # 用户设置
```

---

## 🚀 快速开始

### 环境要求

- JDK 17+
- Maven 3.9.12+
- MySQL 8.0.34+
- Redis 5.0+
- Node.js 16+ (可选，用于前端工具)
- Unity 6000.3.2f1+

### 后端启动步骤

1. **克隆项目**
```bash
git clone https://github.com/your-repo/Ember_Chronicle.git
cd Ember_Chronicle/backend/yaoyan-backend
```

2. **配置数据库**
```bash
# 创建数据库
mysql -u root -p
CREATE DATABASE yaoyan CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

3. **配置Redis**
```bash
# Windows: 使用Docker或下载Redis安装包
# Mac: brew install redis
# Linux: sudo apt-get install redis-server
redis-server
```

4. **配置TripoAI API Key**
```yaml
# 在 application.yml 中配置
trioai:
  api-key: ENC(加密后的key)
  base-url: https://api.tripo3d.ai/v1
```

5. **配置Jasypt加密密码**
```bash
# 设置环境变量
export JASYPT_PASSWORD=your-encryption-password
```

6. **启动项目**
```bash
# 使用Maven
./mvnw spring-boot:run

# 或使用IDE运行 YaoyanApplication.java
```

7. **访问API文档**
```
http://localhost:8080/swagger-ui.html
```

### 前端启动步骤

1. **打开Unity项目**
```bash
cd frontend/Ember_Chronicle
# 使用Unity Hub打开项目
```

2. **配置Git LFS**
```bash
git lfs install
git lfs pull
```

3. **配置后端API地址**
```csharp
// 在Unity中配置API基础URL
const string API_BASE_URL = "http://localhost:8080/api";
```

4. **运行游戏**
```
在Unity编辑器中点击 Play 按钮
```

---

## 📋 开发规范

### 代码命名规范

#### Java命名规范
- **类名**: 大驼峰命名法（PascalCase），如 `UserController`
- **方法名**: 小驼峰命名法（camelCase），如 `getUserById`
- **常量**: 全大写下划线分隔，如 `MAX_RETRY_COUNT`
- **变量**: 小驼峰命名法（camelCase），如 `userName`
- **包名**: 全小写点分隔，如 `com.yaoyan.game.controller`

#### Unity C#命名规范
- **类名**: 大驼峰命名法（PascalCase），如 `GameManager`
- **方法名**: 大驼峰命名法（PascalCase），如 `GetPlayerData`
- **变量**: 小驼峰命名法（camelCase），如 `playerName`
- **私有字段**: 下划线前缀，如 `_playerHealth`

### API接口设计规范

#### RESTful API设计
- **GET**: 获取资源
  - `GET /api/users` - 获取用户列表
  - `GET /api/users/{id}` - 获取指定用户
- **POST**: 创建资源
  - `POST /api/users` - 创建用户
- **PUT**: 更新整个资源
  - `PUT /api/users/{id}` - 更新用户
- **PATCH**: 部分更新资源
  - `PATCH /api/users/{id}` - 部分更新用户
- **DELETE**: 删除资源
  - `DELETE /api/users/{id}` - 删除用户

#### 响应格式
```json
{
  "code": 200,
  "message": "操作成功",
  "data": {},
  "timestamp": 1234567890
}
```

### Git提交规范

#### Commit Message格式
```
<type>(<scope>): <subject>

<body>

<footer>
```

#### Type类型
- `feat`: 新功能
- `fix`: 修复bug
- `docs`: 文档更新
- `style`: 代码格式调整
- `refactor`: 重构
- `perf`: 性能优化
- `test`: 测试相关
- `chore`: 构建/工具相关

#### 示例
```
feat(user): 添加用户注册接口

- 实现用户注册功能
- 添加参数校验
- 添加Swagger文档

Closes #123
```

### 数据库命名规范

- **表名**: 小写下划线分隔，如 `user_info`
- **字段名**: 小写下划线分隔，如 `user_name`
- **主键**: `id`
- **创建时间**: `create_time`
- **更新时间**: `update_time`
- **逻辑删除**: `is_deleted`

---

## 📊 API接口文档

### 访问地址
- **开发环境**: http://localhost:8080/swagger-ui.html
- **测试环境**: http://dev.yaoyan.com/swagger-ui.html
- **生产环境**: https://api.yaoyan.com/swagger-ui.html

### 主要接口模块
- **用户管理**: 用户注册、登录、信息管理
- **角色管理**: 角色创建、属性配置
- **模型生成**: TripoAI 3D模型生成
- **任务管理**: 异步任务查询、状态更新
- **文件管理**: 文件上传、下载

---

## 🔐 安全规范

### 密码加密
- 使用Jasypt加密敏感配置
- 密码使用BCrypt加密存储
- API Key使用环境变量管理

### 接口安全
- 使用JWT进行身份认证
- 敏感接口需要权限验证
- 请求参数进行校验

---

## 📝 每日站会模板

**时间**: 每天 22:00

**三个问题**:
1. 昨天做了什么？
2. 今天计划做什么？
3. 有什么阻碍？

**示例**:
```
小白:
- 昨天: 完成了统一响应格式和全局异常处理
- 今天: 开始实现TripoAI Service封装
- 阻碍: TripoAI API文档需要进一步研究
```

---

## 📚 相关文档

- [TripoAI官方文档](https://docs.tripo3d.ai/)
- [Spring Boot官方文档](https://spring.io/projects/spring-boot)
- [Unity官方文档](https://docs.unity3d.com/)
- [Ink叙事引擎文档](https://inkle.ink/ink/)

---

## 📄 许可证

Apache License 2.0

---

## 📞 联系方式

- **项目负责人**: 小白
- **邮箱**: 3284263390@qq.com

---

## 🗓️ 开发路线图（38天 · 成果导向型）

### 目标：在省赛截止前，交付一套可演示、可验证、有文化深度的湖湘数字叙事原型，包含：

- 可交互的剧情片段（Ink → Unity）
- 结构化关卡设计文档（Markdown）
- 可复现的 AI 文物生成提示词库（Prompt）

### 原则：不做完整游戏，只做高价值、可展示、易评审的核心模块。

### 阶段划分：

#### Phase 1：策划定型（第1–5天）

 核心任务：确定3个核心场景（湘江桥、岳麓书院、长沙窑）；编写全局设定（世界观、角色、叙事规范）；拆解每个场景的文物/NPC/互动点
 交付物：Docs/Worldbuilding/ 目录、Narrative_Guidelines.md、level_01~03.md
 负责人：阿#

#### Phase 2：内容生产（第6–20天）

 核心任务：编写3段 Ink 剧情（每段约2分钟体验）；为每个文物/NPC撰写结构化 Prompt；导出对应 .json 文件
 交付物：Scripts/Story/chapters/、Prompts/artifacts/、Prompts/characters/
 负责人：阿#

#### Phase 3：技术集成（第21–28天）

 核心任务：小明搭建3个基础场景（仅布局+摄像机）；集成 Ink 对话系统，加载 .json；导入 TripoAI 生成的文物模型（.glb）；实现“点击文物 → 播放剧情”
 交付物：Scenes/level_01~03.unity、Models/Artifacts/、Prefabs/interactive_artifact.prefab
 负责人：小明

#### Phase 4：演示优化（第29–35天）

 核心任务：录制3段演示视频（含剧情+模型+文化解说）；生成腾讯文档作品包（含所有源文件链接）；编写 README 演示说明（如何运行/查看）
 交付物：更新后的 README.md、demo_video_*.mp4（可选）、腾讯文档链接
 负责人：全员（小柏统筹）

#### Phase 5：封版提交（第36–38天）

 核心任务：冻结所有 .ink / .md / .prompt；验证 Unity 项目能独立运行（无需联网）；打包最终提交包（含 Git tag + 文档）
 交付物：Git Tag submission-v1、省赛提交压缩包
 负责人：小柏

------

## 🎯最终比赛成果清单：

### 可运行 Unity 原型

- 包含3个场景，每个场景可点击1–2个文物触发剧情
- 使用真实 TripoAI 生成的湖湘文物模型（.glb）
- 对话系统基于 .json，支持选项分支

### 完整策划资产包（全部在 Git 中）

- 剧本：Assets/Scripts/Story/（含 .ink 源码 + .json）
- 设计文档：Assets/Docs/（含关卡、世界观、规范）
- Prompt 库：Assets/Prompts/（英文、结构化、带注释）

### 作品说明文档

- README.md：含演示指引、技术栈、文化依据
- 腾讯文档：汇总截图、视频、分工、创新点

不交付：完整战斗系统、用户登录、后端 API、多结局等非核心功能。

---

**最后更新**: 2025-12-26
**版本**: 0.0.1-SNAPSHOT