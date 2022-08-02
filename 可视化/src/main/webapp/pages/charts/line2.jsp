<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="/static/h-ui/js/echarts.js" charset="UTF-8"></script>
</head>
<body>

<!-- 为echarts准备一个容器Dom div -->
<div id="main" style="width: 90%;height:430px;"></div>

<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var chartDom = document.getElementById('main');
    var myChart = echarts.init(chartDom);

    $.ajax({
        type: "GET",
        url: "/charts/getLog3Data",
        dataType: 'json',
        //回调函数  data里边就是我们需要的数据
        success: function(data2) {
            var option = {
                title: {
                    text: '用户收藏量'
                },
                toolbox: {
                    feature: {
                        saveAsImage: {
                            title: '保存图片'
                        },
                        dataView: {},
                        magicType: {
                            type: ['line', 'bar']
                        },
                        dataZoom: {},
                        restore: {}

                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow'
                    }
                },
                legend: {},
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: {
                    type: 'value',
                    boundaryGap: [0, 0.01]
                },
                yAxis: {
                    type: 'category',
                    data: data2.name
                },
                series: [
                    {
                        name: '收藏量',
                        type: 'bar',
                        data: data2.value
                    }
                ]
            };

            option && myChart.setOption(option);
        }
    })





</script>
</body>
</html>