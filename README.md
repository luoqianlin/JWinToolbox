# JWinToolbox
Java调用WinApi工具类

1、获取Windows系统当前音量：

double curVolume = WinToolbox.GetCurVolume(true);

2、设置Windows系统当前音量：

WinToolbox.ChangeVolume(v,true);


**注意：将WinToolbox.dll添加到java本地库查找路径中。
若报dll缺少依赖，将ucrtbased.dll、vcruntime140d.dll放到与WinToolbox.dll同级目录**