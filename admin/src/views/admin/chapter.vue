<template>
  <div>
    <p>
      <button v-on:click="add()" class="btn btn-white btn-default btn-round">
        <i class="ace-icon fa fa-refresh "></i>
        新增
      </button>
      &nbsp;
      <button v-on:click="list(1)" class="btn btn-white btn-default btn-round">
        <i class="ace-icon fa fa-refresh "></i>
        刷新
      </button>
    </p>
    <pagination ref="pagination" v-bind:list="list" v-bind:itemCount="8"></pagination>
    <!-- PAGE CONTENT BEGINS -->
    <table id="simple-table" class="table  table-bordered table-hover">
      <thead>
      <tr>
        <th>ID</th>
        <th>名称</th>
        <th>课程</th>
        <th>操作</th>
      </tr>ID
      </thead>

      <tbody>
      <tr v-for="chapter in chapters">
        <td>{{chapter.id}}</td>
        <td>{{chapter.name}}</td>
        <td>{{chapter.courseId}}</td>

        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button class="btn btn-xs btn-success">
              <i class="ace-icon fa fa-check bigger-120"></i>
            </button>

            <button class="btn btn-xs btn-info">
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>

            <button class="btn btn-xs btn-danger">
              <i class="ace-icon fa fa-trash-o bigger-120"></i>
            </button>

            <button class="btn btn-xs btn-warning">
              <i class="ace-icon fa fa-flag bigger-120"></i>
            </button>
          </div>

          <div class="hidden-md hidden-lg">
            <div class="inline pos-rel">
              <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
              </button>

              <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                <li>
                  <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
																			<span class="blue">
																				<i class="ace-icon fa fa-search-plus bigger-120"></i>
																			</span>
                  </a>
                </li>

                <li>
                  <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
																			<span class="green">
																				<i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
																			</span>
                  </a>
                </li>

                <li>
                  <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
																			<span class="red">
																				<i class="ace-icon fa fa-trash-o bigger-120"></i>
																			</span>
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </td>
      </tr>
      <tr class="detail-row">
        <td colspan="8">
          <div class="table-detail">
            <div class="row">
              <div class="col-xs-12 col-sm-2">
                <div class="text-center">
                  <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar" src="assets/images/avatars/profile-pic.jpg" />
                  <br />
                  <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                    <div class="inline position-relative">
                      <a class="user-title-label" href="#">
                        <i class="ace-icon fa fa-circle light-green"></i>
                        &nbsp;
                        <span class="white">Alex M. Doe</span>
                      </a>
                    </div>
                  </div>
                </div>
              </div>

              <div class="col-xs-12 col-sm-7">
                <div class="space visible-xs"></div>

                <div class="profile-user-info profile-user-info-striped">
                  <div class="profile-info-row">
                    <div class="profile-info-name"> Username </div>

                    <div class="profile-info-value">
                      <span>alexdoe</span>
                    </div>
                  </div>

                  <div class="profile-info-row">
                    <div class="profile-info-name"> Location </div>

                    <div class="profile-info-value">
                      <i class="fa fa-map-marker light-orange bigger-110"></i>
                      <span>Netherlands, Amsterdam</span>
                    </div>
                  </div>

                  <div class="profile-info-row">
                    <div class="profile-info-name"> Age </div>

                    <div class="profile-info-value">
                      <span>38</span>
                    </div>
                  </div>

                  <div class="profile-info-row">
                    <div class="profile-info-name"> Joined </div>

                    <div class="profile-info-value">
                      <span>2010/06/20</span>
                    </div>
                  </div>

                  <div class="profile-info-row">
                    <div class="profile-info-name"> Last Online </div>

                    <div class="profile-info-value">
                      <span>3 hours ago</span>
                    </div>
                  </div>

                  <div class="profile-info-row">
                    <div class="profile-info-name"> About Me </div>

                    <div class="profile-info-value">
                      <span>Bio</span>
                    </div>
                  </div>
                </div>
              </div>

              <div class="col-xs-12 col-sm-3">
                <div class="space visible-xs"></div>
                <h4 class="header blue lighter less-margin">Send a message to Alex</h4>

                <div class="space-6"></div>

                <form>
                  <fieldset>
                    <textarea class="width-100" resize="none" placeholder="Type something…"></textarea>
                  </fieldset>

                  <div class="hr hr-dotted"></div>

                  <div class="clearfix">
                    <label class="pull-left">
                      <input type="checkbox" class="ace" />
                      <span class="lbl"> Email me a copy</span>
                    </label>

                    <button class="pull-right btn btn-sm btn-primary btn-white btn-round" type="button">
                      Submit
                      <i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
                    </button>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </td>
      </tr>

      </tbody>
    </table>
    <div id="form-modal" class="modal fade" tabindex="-1" role="dialog">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">表单</h4>
          </div>
          <div class="modal-body">
            <form class="form-horizontal">
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">名称</label>
                <div class="col-sm-10">
                  <input v-model="chapter.name" type="email" class="form-control" id="inputEmail3" placeholder="名称">
                </div>
              </div>
              <div class="form-group">
                <label for="input课程ID3" class="col-sm-2 control-label">课程ID</label>
                <div class="col-sm-10">
                  <input v-model="chapter.courseId" type="email" class="form-control" id="input课程ID3" placeholder="课程ID">
                </div>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button v-on:click="save()" type="button" class="btn btn-primary">保存</button>
          </div>
        </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

  </div>
</template>

<script>
  import Pagination from "../../components/pagination"
  export default {
    components: {Pagination},
    name: 'chapter',
    data: function(){
      return {
        chapter: {},
        chapters: []
      }
    },
    mounted() {
      let _this = this;
      _this.$refs.pagination.size = 5;
      _this.list();
      //sidebar激活样式方法一
      // this.$parent.activeSideBar("business-chapter-sidebar")
    },
    methods: {
      add (){
        let _this = this;
        $("#form-modal").modal("show");
      },

      list (page){
        let _this = this;
        _this.$ajax.post('http://127.0.0.1:9000/business/admin/chapter/list',{
          page:page,
          size:_this.$refs.pagination.size
        }).then((response)=>{
          console.log("查询大章列表：",response);
          let responseDto = response.data;
          _this.chapters = responseDto.content.list;
          _this.$refs.pagination.render(page,responseDto.content.total);
        })
      },

      save (page){
        let _this = this;
        _this.$ajax.post('http://127.0.0.1:9000/business/admin/chapter/save',
          _this.chapter).then((response)=>{
          console.log("保存大章列表结果：",response);
          let responseDto = response.data;
          if(responseDto.success){
            $("#form-modal").modal("hide");
            _this.list(1);
          }
        })
      }
    }
  }
</script>