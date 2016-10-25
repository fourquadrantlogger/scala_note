# Trait

在scala中,当一个类继承了Trait,它就实现了这个trait的所有接口,同时还获取了所有的代码。

## 举例

```
trait Ord{
    def <(that:Any):Boolean
    def <=(that:Any):Boolean=(this<that)||(this==that)
    def >(that:Any):Boolean=!(this<=that)
    def >=(that:Any):Boolean=!(this<that)
}
```