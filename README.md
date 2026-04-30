````md
# 🌱 Spring Core Concepts - README

This repository explains important Spring Framework concepts:

- ApplicationContext
- Bean Injection Approaches
- @Qualifier
- Lazy Loading Heavy Beans
- Spring Bean Lifecycle

---

# 📚 Table of Contents

1. What is ApplicationContext?
2. Dependency Injection Types
3. Why @Qualifier?
4. How to Avoid Heavy Bean Loading
5. Spring Lifecycle Stages
6. Best Practices
7. Example Code

---

# 1️⃣ What is ApplicationContext?

`ApplicationContext` is the central container in Spring Framework.

It is responsible for:

- Creating beans
- Managing beans
- Injecting dependencies
- Reading properties
- Managing lifecycle
- Profiles and environments
- Event handling

It is an advanced version of `BeanFactory`.

---

## Example

```java
ApplicationContext context =
    new AnnotationConfigApplicationContext(AppConfig.class);

UserService service = context.getBean(UserService.class);
````

---

# 2️⃣ Dependency Injection Types

Spring supports 3 major injection types:

---

## A. Constructor Injection ✅ Recommended

```java
@Component
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
}
```

### Advantages

* Best practice
* Immutable dependency
* Easy unit testing
* No NullPointer issues
* Mandatory dependencies enforced

---

## B. Setter Injection

```java
@Component
public class UserService {

    private UserRepository repository;

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }
}
```

### Advantages

* Good for optional dependencies

### Disadvantages

* Can create incomplete object

---

## C. Field Injection ❌ Not Recommended

```java
@Component
public class UserService {

    @Autowired
    private UserRepository repository;
}
```

### Disadvantages

* Hard to test
* Hidden dependency
* Reflection based

---

# 3️⃣ Why Use @Qualifier?

When multiple beans of same type exist, Spring gets confused.

---

## Example Problem

```java
@Component
class PetrolEngine implements Engine {}

@Component
class DieselEngine implements Engine {}
```

Now:

```java
@Autowired
private Engine engine;
```

This gives:

```text
NoUniqueBeanDefinitionException
```

---

## Solution

```java
@Autowired
@Qualifier("petrolEngine")
private Engine engine;
```

Spring injects specific bean.

---

## Constructor Example

```java
public Car(@Qualifier("dieselEngine") Engine engine) {
    this.engine = engine;
}
```

---

## Alternative: @Primary

```java
@Component
@Primary
class PetrolEngine implements Engine {}
```

Default bean selected automatically.

---

# 4️⃣ How to Avoid Loading Heavy Beans on Startup?

Heavy beans:

* Cache loaders
* API clients
* Large config readers
* ML models
* Large startup services

These slow application startup.

---

## Use @Lazy

```java
@Component
@Lazy
public class HeavyCache {

    public HeavyCache() {
        System.out.println("Heavy bean initialized");
    }
}
```

Bean created only when first used.

---

## Lazy Injection

```java
@Autowired
@Lazy
private HeavyCache cache;
```

---

## Other Options

### Profiles

```java
@Profile("prod")
@Component
class AnalyticsService {}
```

### Conditional Loading

```java
@ConditionalOnProperty(
    name = "cache.enabled",
    havingValue = "true"
)
```

---

# 5️⃣ Spring Bean Lifecycle

---

## Lifecycle Flow

```text
1. Container Starts
2. Bean Created
3. Dependencies Injected
4. @PostConstruct
5. Bean Ready
6. Application Running
7. @PreDestroy
8. Bean Destroyed
```

---

## Example

```java
@Component
public class MyBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed");
    }
}
```

---

# 6️⃣ Best Practices

✅ Use Constructor Injection
✅ Use @Qualifier when multiple beans exist
✅ Use @Lazy for expensive beans
✅ Use @PostConstruct for startup logic
✅ Use @PreDestroy for cleanup
✅ Keep classes single responsibility

---

# 7️⃣ Real World Example

```java
@Service
public class PaymentService {

    private final PaymentGateway gateway;

    public PaymentService(
        @Qualifier("stripeGateway")
        PaymentGateway gateway
    ) {
        this.gateway = gateway;
    }
}
```

---

# 🎯 Final Summary

`ApplicationContext` is the heart of Spring that manages beans, lifecycle, dependencies, configuration, and startup behavior.

---

```
```
