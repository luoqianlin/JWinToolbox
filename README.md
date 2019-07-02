# JWinToolbox
Java调用WinApi工具类

1、获取Windows系统当前音量：

double curVolume = WinToolbox.GetCurVolume(true);

2、设置Windows系统当前音量：

WinToolbox.ChangeVolume(v,true);
