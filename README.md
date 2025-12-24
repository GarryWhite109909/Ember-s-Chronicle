# Ember's Chronicle

## 📖 项目简介

Ember's Chronicle 是一款以湖湘文化为题材的3D游戏，结合TripoAI AI生成技术，为玩家提供沉浸式的文化体验。

**项目特色：**
- 🎨 基于湖湘文化的历史背景
- 🤖 TripoAI AI生成3D模型
- 🎮 Unity 3D游戏引擎
- 🌐 Spring Boot后端服务

---

## 👥 团队成员

| 角色 | 姓名 | 职责 |
|------|------|------|
| 后端/AI接口 | 小白 | 后端开发、TripoAI集成、API接口设计 |
| Unity主程序 | 小明 | Unity开发、3D模型处理、前端交互 |
| 叙事/关卡策划 | 阿# | 游戏剧本、关卡设计、Prompt工程 |
| 数值/工具开发 | 大帅 | 数值平衡、工具开发、自动化脚本 |
| PM/测试 | 小柏 | 项目管理、测试、文档管理 |

---

## 🛠️ 技术栈

### 后端技术栈
- **框架**: Spring Boot 3.5.9
- **Java版本**: JDK 17
- **构建工具**: Maven 3.5.9
- **数据库**: MySQL 8.0
- **缓存**: Redis
- **ORM**: Spring Data JPA
- **API文档**: SpringDoc OpenAPI (Swagger)
- **配置加密**: Jasypt
- **监控**: Spring Boot Actuator
- **HTTP客户端**: OkHttp 4.12.0
- **JSON处理**: FastJSON2 2.0.43
- **AI服务**: TripoAI SDK

### 前端技术栈
- **游戏引擎**: Unity 6000.3.2f1
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
├── backend/                    # 后端项目
│   └── yaoyan-backend/        # Spring Boot项目
│       ├── src/
│       │   ├── main/
│       │   │   ├── java/com/yaoyan/game/
│       │   │   │   ├── common/          # 通用类（Result、ResultCode等）
│       │   │   │   ├── config/          # 配置类
│       │   │   │   ├── controller/      # 控制器层
│       │   │   │   ├── service/         # 业务逻辑层
│       │   │   │   ├── repository/      # 数据访问层
│       │   │   │   ├── entity/          # 实体类
│       │   │   │   ├── dto/             # 数据传输对象
│       │   │   │   ├── exception/       # 异常处理
│       │   │   │   └── util/            # 工具类
│       │   │   └── resources/
│       │   │       ├── application.yml          # 主配置文件
│       │   │       ├── application-dev.yml      # 开发环境配置
│       │   │       └── application-prod.yml     # 生产环境配置
│       │   └── test/              # 测试代码
│       └── pom.xml               # Maven配置文件
└── frontend/                   # 前端项目
    └── Ember_Chronicle/        # Unity项目
        ├── Assets/             # Unity资源
        ├── Packages/           # Unity包
        ├── ProjectSettings/    # 项目设置
        └── UserSettings/       # 用户设置
```

---

## 🚀 快速开始

### 环境要求

- JDK 17+
- Maven 3.5.9+
- MySQL 8.0+
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
- **邮箱**: yaoyan@example.com
- **GitHub**: https://github.com/your-repo/Ember_Chronicle

---

## 🎯 开发路线图

### 第一阶段（Week 1-2）- 基础设施搭建
- [x] 项目初始化
- [x] 统一响应格式
- [x] 全局异常处理
- [x] Swagger配置
- [ ] 用户认证系统
- [ ] TripoAI Service封装
- [ ] 基础数据表设计

### 第二阶段（Week 3-4）- 核心功能开发
- [ ] 用户管理模块
- [ ] 角色管理模块
- [ ] 3D模型生成模块
- [ ] 任务管理模块
- [ ] 文件管理模块

### 第三阶段（Week 5-6）- Unity集成
- [ ] Unity HTTP客户端
- [ ] 3D模型加载
- [ ] 游戏逻辑对接

### 第四阶段（Week 7-8）- 测试与优化
- [ ] 单元测试
- [ ] 集成测试
- [ ] 性能优化
- [ ] Bug修复

---

**最后更新**: 2025-01-XX
**版本**: 0.0.1-SNAPSHOT
